package com.example.wc19.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.example.wc19.R
import com.example.wc19.model.Player
import kotlinx.android.synthetic.main.activity_players.*

class PlayersActivity : AppCompatActivity() {


    lateinit var objPlayerList:Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players)

        rv_playersList.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        rv_playersList.setHasFixedSize(true)

        objPlayerList = intent.getSerializableExtra("PlayersName") as Player


    }
}
