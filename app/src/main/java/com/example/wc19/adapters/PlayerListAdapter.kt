package com.example.wc19.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wc19.R
import com.example.wc19.model.Player
import com.example.wc19.model.Team
import com.example.wc19.model.TeamListModel
import kotlinx.android.synthetic.main.item_players_list.view.*

class PlayerListAdapter(val context: Context,val playerList: List<TeamListModel>): RecyclerView.Adapter<PlayerListAdapter.PlayerHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PlayerHolder {

        val view = LayoutInflater.from(p0.context).inflate(R.layout.item_players_list,p0,false)
        return PlayerHolder(view)
    }

    override fun getItemCount(): Int {

        return playerList.size
    }

    override fun onBindViewHolder(p0: PlayerHolder, p1: Int) {

        p0.playerName.text=playerList[p1].team_list[p1].player_list[p1].player_one
    }

    class PlayerHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        val playerName = itemView.tv_player_name
    }
}