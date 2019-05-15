package com.example.wc19.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.wc19.R
import com.example.wc19.model.PlayerDetailsModel
import kotlinx.android.synthetic.main.item_player_details.view.*

class PlayerDetailsAdapter(var context: Context, var playerDetailsModel: PlayerDetailsModel) :
    RecyclerView.Adapter<PlayerDetailsAdapter.DetailsHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): DetailsHolder {

        val view = LayoutInflater.from(p0.context).inflate(R.layout.item_player_details, p0, false)
        return DetailsHolder(view)

    }

    override fun getItemCount(): Int {

        return 1
    }

    override fun onBindViewHolder(p0: DetailsHolder, p1: Int) {

        p0.playerName.text = playerDetailsModel.name
        p0.playerCountry.text = playerDetailsModel.country

        Glide.with(context)
            .load(playerDetailsModel.imageURL)
            .into(p0.playerIcon)

        p0.playerDOB.text = "Born: " + playerDetailsModel.born
        p0.playerAge.text = "Age: " + playerDetailsModel.currentAge
        p0.playerRole.text = "Role: " + playerDetailsModel.playingRole
        p0.playerBattingstyle.text = "Batting Style: " + playerDetailsModel.battingStyle
        p0.playerBowlingStyle.text = "Bowling Style: " + playerDetailsModel.bowlingStyle
        p0.playerMajorTeams.text = "Major Teams: " + playerDetailsModel.majorTeams

        p0.playerProfile.text = playerDetailsModel.profile

        Log.d("1122", "" + playerDetailsModel.profile)

        var oneDay = playerDetailsModel.data.batting.ODIs

//        Log.d("1122", "" + oneDay.Runs)

//        if (oneDay == null) {
//            Toast.makeText(context, "Player Data is not available!", Toast.LENGTH_SHORT).show()
//        } else {

            p0.playerMatchesBat?.text = oneDay?.Mat
            p0.playerInnBat?.text = oneDay?.Inns
            p0.playerNotOut?.text = oneDay?.NO
            p0.playerRunsBat?.text = oneDay?.Runs
            p0.playerHS?.text = oneDay?.HS
            p0.playerAVGBat?.text = oneDay?.Ave
            p0.playerBallFaced?.text = oneDay?.BF
            p0.playerSRBat?.text = oneDay?.SR
            p0.playerHundred?.text = oneDay?.hundred
            p0.playerFifties?.text = oneDay?.fifty
            p0.playerSix?.text = oneDay?.six
            p0.playerFours?.text = oneDay?.fours
            p0.playerCatches?.text = oneDay?.Ct
            p0.playerStumping?.text = oneDay?.St
//        }
        var oneDayBowling = playerDetailsModel.data.bowling.ODIs
//        Log.d("1122", "" + oneDayBowling.Mat)

//        if (oneDayBowling == null){
//            Toast.makeText(context, "Player Data is not available!", Toast.LENGTH_SHORT).show()
//        } else {

            p0.playerMatchesBowl?.text = oneDayBowling?.Mat
            p0.playerInnBowl?.text = oneDayBowling?.Inns
            p0.balls?.text = oneDayBowling?.Balls
            p0.runsBow?.text = oneDayBowling?.Runs
            p0.wickets?.text = oneDayBowling?.Wkts
            p0.bbm?.text = oneDayBowling?.BBM
            p0.bbi?.text = oneDayBowling?.BBI
            p0.average?.text = oneDayBowling?.Ave
            p0.economy?.text = oneDayBowling?.Econ
            p0.strikeRate?.text = oneDayBowling?.SR
            p0.fourWkts?.text = oneDayBowling?.fourWickets
            p0.fiveWkts?.text = oneDayBowling?.fiveWickets
            p0.tenWickets?.text = oneDayBowling?.tenWickets
//        }
    }

    class DetailsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val playerIcon = itemView.iv_player_icon
        val playerName = itemView.tv_player_name_details
        val playerCountry = itemView.tv_player_country_details

        //Personal Information
        val playerDOB = itemView.tv_player_dob
        val playerAge = itemView.tv_player_age
        val playerRole = itemView.tv_player_role
        val playerBattingstyle = itemView.tv_player_batting_style
        val playerBowlingStyle = itemView.tv_player_bowling_style
        val playerMajorTeams = itemView.tv_player_major_teams

        //Profile
        val playerProfile = itemView.tv_player_profile
//        val readMore = itemView.tv_more
//        val readLess = itemView.tv_less

        //Batting
        val playerMatchesBat = itemView.tv_player_matches
        val playerInnBat = itemView.tv_innings
        val playerNotOut = itemView.tv_not_out
        val playerRunsBat = itemView.tv_runs
        val playerHS = itemView.tv_highest_score
        val playerAVGBat = itemView.tv_average
        val playerBallFaced = itemView.tv_ball_faced
        val playerSRBat = itemView.tv_strike_rate
        val playerHundred = itemView.tv_hundreds
        val playerFifties = itemView.tv_fifties
        val playerFours = itemView.tv_fours
        val playerSix = itemView.tv_six
        val playerCatches = itemView.tv_catches
        val playerStumping = itemView.tv_stumpings

        //Bowling
        val playerMatchesBowl = itemView.tv_player_matches_bowling
        val playerInnBowl = itemView.tv_innings_bowling
        val balls = itemView.tv_balls_bowling
        val runsBow = itemView.tv_runs_bowling
        val wickets = itemView.tv_wickets_bowling
        val bbm = itemView.tv_bbm_bowling
        val bbi = itemView.tv_bbi_bowling
        val average = itemView.tv_avg_bowling
        val economy = itemView.tv_economy_bowling
        val strikeRate = itemView.tv_sr_bowling
        val tenWickets = itemView.tv_ten_wickets_bowling
        val fiveWkts = itemView.tv_five_wickets_bowling
        val fourWkts = itemView.tv_four_wickets_bowling

    }
}