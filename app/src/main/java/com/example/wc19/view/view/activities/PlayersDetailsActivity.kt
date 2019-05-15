package com.example.wc19.view.view.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.LinearLayout
import android.widget.Toast
import com.example.wc19.R
import com.example.wc19.adapters.PlayerDetailsAdapter
import com.example.wc19.api.WebService
import com.example.wc19.model.Player
import com.example.wc19.model.PlayerDetailsModel
import com.example.wc19.utils.CRIC_API
import com.example.wc19.utils.hideProgressBar
import com.example.wc19.utils.showProgressBar
import kotlinx.android.synthetic.main.activity_players_details.*

class PlayersDetailsActivity : AppCompatActivity() {

    companion object{
        val PLAYER_DETAILS: String = "PlayerDetails"
    }

    lateinit var objPlayersDetails: Player

    lateinit var playerDetailsModel: PlayerDetailsModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players_details)

        objPlayersDetails = intent.getSerializableExtra(PLAYER_DETAILS) as Player

        var playerID:Int = objPlayersDetails.pid

        rv_player_details.setHasFixedSize(true)
        rv_player_details.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)

        showProgressBar(this)

        WebService.callPlayerDetailsAPI(CRIC_API,playerID){ responseObj, error ->

            if (error==null){
                playerDetailsModel= responseObj!!
                Log.d("onResponse",""+responseObj)
                var playerDetailsAdapter=PlayerDetailsAdapter(applicationContext,playerDetailsModel)
                rv_player_details.adapter=playerDetailsAdapter
                hideProgressBar()
            } else{
                hideProgressBar()
                Toast.makeText(applicationContext,""+error,Toast.LENGTH_SHORT).show()

            }
        }


    }
}
