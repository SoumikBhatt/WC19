package com.example.wc19.view.view.activities

import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.wc19.R
import com.example.wc19.model.Match
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_match_details.*
import kotlinx.android.synthetic.main.activity_match_details.iv_back_details

class MatchDetailsActivity : AppCompatActivity() {

    companion object {
        val DETAILS_KEY: String = "DetailsKey"
    }

    lateinit var objMatchDetails:Match

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        objMatchDetails = intent.getSerializableExtra(DETAILS_KEY) as Match

        tv_match_number.text = objMatchDetails.match_number
        tv_match_info.text = objMatchDetails.match_time+", "+objMatchDetails.venue

        tv_team_name_one.text = objMatchDetails.team_one.country
        tv_team_name_two.text = objMatchDetails.team_two.country

        tv_total_match.text = "Matches: "+objMatchDetails.total_match
        tv_team_one_win.text = objMatchDetails.team_one.country+": "+objMatchDetails.team_one.win
        tv_team_two_win.text = objMatchDetails.team_two.country+": "+objMatchDetails.team_two.win

        tv_player_one_name.text = objMatchDetails.team_one.player
        tv_player_two_name.text = objMatchDetails.team_two.player


        var resources: Resources = applicationContext.resources

        val flagOne:Int = resources.getIdentifier(objMatchDetails.team_one.flag,"drawable",applicationContext.packageName)
        val flagTwo:Int = resources.getIdentifier(objMatchDetails.team_two.flag,"drawable",applicationContext.packageName)

        iv_flag_team_one.setImageResource(flagOne)
        iv_flag_team_two.setImageResource(flagTwo)

        val playerOne:Int = resources.getIdentifier(objMatchDetails.team_one.player,"drawable",applicationContext.packageName)
        val playerTwo:Int = resources.getIdentifier(objMatchDetails.team_two.player,"drawable",applicationContext.packageName)

        iv_player_one.setImageResource(playerOne)
        iv_player_two.setImageResource(playerTwo)

        iv_back_det.setOnClickListener(View.OnClickListener {

            onBackPressed()
        })
    }
}
