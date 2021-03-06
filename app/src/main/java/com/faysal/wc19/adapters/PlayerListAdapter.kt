package com.faysal.wc19.adapters

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.faysal.wc19.R
import com.faysal.wc19.model.Player
import com.faysal.wc19.view.view.activities.PlayersDetailsActivity
import kotlinx.android.synthetic.main.item_players_list.view.*

class PlayerListAdapter(val context: Context,val playerList: List<Player>): RecyclerView.Adapter<PlayerListAdapter.PlayerHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PlayerHolder {

        val view = LayoutInflater.from(p0.context).inflate(R.layout.item_players_list,p0,false)
        return PlayerHolder(view)
    }

    override fun getItemCount(): Int {

        return playerList.size
    }

    override fun onBindViewHolder(p0: PlayerHolder, p1: Int) {

        p0.playerName.text=playerList[p1].name

        var resources: Resources = context.resources

        val image = resources.getIdentifier(playerList[p1].image,"drawable",context.packageName)

        p0.playerImage.setImageResource(image)

        p0.itemView.setOnClickListener(View.OnClickListener {
            var intent = Intent(context, PlayersDetailsActivity::class.java)
            intent.putExtra(PlayersDetailsActivity.PLAYER_DETAILS,playerList[p1])
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        })


    }

    class PlayerHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        val playerName = itemView.tv_player_name
        val playerImage = itemView.iv_player_img
    }
}