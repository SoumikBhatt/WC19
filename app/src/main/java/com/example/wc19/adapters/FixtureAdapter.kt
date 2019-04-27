package com.example.wc19.adapters

import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wc19.R
import com.example.wc19.model.WCData
import kotlinx.android.synthetic.main.item_fixture.view.*

class FixtureAdapter(var context: Context,var wcData: WCData) : RecyclerView.Adapter<FixtureAdapter.FixtureHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): FixtureHolder {

        val view = LayoutInflater.from(p0.context).inflate(R.layout.item_fixture,p0,false)
        return FixtureHolder(view)

    }

    override fun getItemCount(): Int {

        return wcData.match_list.size
    }

    override fun onBindViewHolder(p0: FixtureHolder, p1: Int) {

        p0.match_number.text= wcData.match_list[p1].match_number
        Log.i("Match NO",""+wcData.match_list[p1].match_number)
        p0.matchDay.text = "Match Day: "+wcData.match_list[p1].match_day
        p0.team_one.text = wcData.match_list[p1].team_one.country
        p0.team_two.text = wcData.match_list[p1].team_two.country
        p0.matchTime.text = "Match Time: "+wcData.match_list[p1].match_time
        p0.matchVenue.text = "Venue: "+wcData.match_list[p1].venue

        //getting flag images

        var resources:Resources = context.resources

        val resourceID:Int = resources.getIdentifier(wcData.match_list[p1].team_one.flag,"drawable",context.packageName)
        val flagIconTwo:Int = resources.getIdentifier(wcData.match_list[p1].team_two.flag,"drawable",context.packageName)
//
//        var drawable : Drawable = resources.getDrawable(resourceID)
//
//        var bitmap : Bitmap = BitmapFactory.decodeResource(context.resources,resourceID)

        p0.flagTeamOne.setImageResource(resourceID)
        p0.flagTeamTwo.setImageResource(flagIconTwo)
    }

    class FixtureHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val match_number = itemView.tv_match_number
        val matchDay = itemView.tv_match_day
        val team_one = itemView.tv_team_name_one
        val team_two = itemView.tv_team_name_two
        val matchTime = itemView.tv_match_time
        val matchVenue = itemView.tv_match_venue
        val flagTeamOne = itemView.iv_team_one
        val flagTeamTwo = itemView.iv_team_two
    }
}