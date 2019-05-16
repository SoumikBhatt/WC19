package com.faysal.wc19.adapters

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.faysal.wc19.R
import com.faysal.wc19.view.view.activities.PlayersActivity
import com.faysal.wc19.model.TeamModel
import kotlinx.android.synthetic.main.item_team_list.view.*

class TeamListAdapter(var context: Context, var teamListModel: TeamModel): RecyclerView.Adapter<TeamListAdapter.TeamHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): TeamHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.item_team_list,p0,false)
        return TeamHolder(view)
    }

    override fun getItemCount(): Int {

       return teamListModel.team_list.size
    }

    override fun onBindViewHolder(p0: TeamHolder, p1: Int) {

        p0.teamName.text = teamListModel.team_list[p1].team_name
        p0.teamRank.text = "ICC Ranking:"+teamListModel.team_list[p1].team_ranking

        var resources:Resources = context.resources

        val icon = resources.getIdentifier(teamListModel.team_list[p1].icon,"drawable",context.packageName)

        p0.teamIcon.setImageResource(icon)

        p0.itemView.setOnClickListener(View.OnClickListener {

            var intent = Intent(context, PlayersActivity::class.java)
            intent.putExtra("PlayersName",teamListModel.team_list[p1])
            context.startActivity(intent)

        })
    }

    class TeamHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        val teamIcon = itemView.iv_team_icon
        val teamName = itemView.tv_team_name
        val teamRank = itemView.tv_team_rank


    }
}