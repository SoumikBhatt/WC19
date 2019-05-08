package com.example.wc19.view.view.activities

import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.wc19.R
import com.example.wc19.model.Match
import kotlinx.android.synthetic.main.activity_match_details.*

class MatchDetailsActivity : AppCompatActivity() {

    companion object {
        val DETAILS_KEY: String = "DetailsKey"
    }

    lateinit var objMatchDetails:Match

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match_details)

        objMatchDetails = intent.getSerializableExtra(DETAILS_KEY) as Match

        tv_team_one_won.text=objMatchDetails.team_one.country
        tv_team_two_won.text=objMatchDetails.team_two.country

        tv_team_one_win_match.text="Win: "+objMatchDetails.team_one.win
        tv_team_two_win_match.text="Win: "+objMatchDetails.team_two.win

        tv_team_one_player_name.text=objMatchDetails.team_one.player
        tv_team_two_player_name.text=objMatchDetails.team_two.player

        var resources: Resources = applicationContext.resources

        val flagOne:Int = resources.getIdentifier(objMatchDetails.team_one.flag,"drawable",applicationContext.packageName)
        val flagTwo:Int = resources.getIdentifier(objMatchDetails.team_two.flag,"drawable",applicationContext.packageName)

        iv_team_one_head.setImageResource(flagOne)
        iv_team_two_head.setImageResource(flagTwo)

        val playerOne:Int = resources.getIdentifier(objMatchDetails.team_one.player,"drawable",applicationContext.packageName)
        val playerTwo:Int = resources.getIdentifier(objMatchDetails.team_two.player,"drawable",applicationContext.packageName)

        iv_team_one_player.setImageResource(playerOne)
        iv_team_two_player.setImageResource(playerTwo)

        iv_back_details.setOnClickListener(View.OnClickListener {

            onBackPressed()
        })
    }
}
