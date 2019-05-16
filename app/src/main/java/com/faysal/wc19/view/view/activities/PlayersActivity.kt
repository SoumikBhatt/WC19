package com.faysal.wc19.view.view.activities

import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.faysal.wc19.R
import com.faysal.wc19.adapters.PlayerListAdapter
import com.faysal.wc19.model.Team
import kotlinx.android.synthetic.main.activity_players.*

class PlayersActivity : AppCompatActivity() {


    lateinit var objPlayerList: Team

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players)

        rv_playersList.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        rv_playersList.setHasFixedSize(true)

        objPlayerList = intent.getSerializableExtra("PlayersName") as Team

        var resources:Resources = applicationContext.resources
        var teamIcon = resources.getIdentifier(objPlayerList.icon,"drawable",applicationContext.packageName)

        iv_toolbar_image.setImageResource(teamIcon)

        collapsing_tool_bar.title=objPlayerList.team_name


        var playerListAdapter = PlayerListAdapter(applicationContext,objPlayerList.player_list)
        rv_playersList.adapter = playerListAdapter

//        iv_back.setOnClickListener(View.OnClickListener {
//            onBackPressed()
//        })


    }
}
