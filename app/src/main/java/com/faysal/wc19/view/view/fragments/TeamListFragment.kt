package com.faysal.wc19.view.view.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.faysal.wc19.R
import com.faysal.wc19.adapters.TeamListAdapter
import com.faysal.wc19.model.TeamModel
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_team_list.view.*

class TeamListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_team_list, container, false)

        val teamList :String? = activity?.assets?.open("team_list_JSON.json")?.bufferedReader().use {
            it?.readText()
        }

        Log.i("JSON_Team",""+teamList)

        val teamInfo = Gson().fromJson(teamList, TeamModel::class.java)

        Log.i("GSON_Team",""+teamInfo)

        var teamRecycler= view.rv_team_list

        teamRecycler.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        teamRecycler.setHasFixedSize(true)
        teamRecycler.isNestedScrollingEnabled = false


        val teamListModel:TeamModel = teamInfo

        val teamListAdapter = TeamListAdapter(context!!,teamListModel)
        teamRecycler.adapter=teamListAdapter


        return view
    }
}
