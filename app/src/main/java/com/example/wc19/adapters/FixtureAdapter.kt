package com.example.wc19.adapters

import android.content.Context
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
    }

    class FixtureHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val match_number = itemView.tv_match_number
        val matchDay = itemView.tv_match_day
    }
}