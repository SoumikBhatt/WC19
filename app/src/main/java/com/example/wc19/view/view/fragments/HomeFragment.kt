package com.example.wc19.view.view.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout.VERTICAL

import com.example.wc19.R
import com.example.wc19.adapters.FixtureAdapter
import com.example.wc19.model.WCData
import com.google.gson.Gson
import kotlin.Byte as Byte1


class HomeFragment : Fragment() {

    private var fixtureList: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       var view = inflater.inflate(R.layout.fragment_home, container, false)

        val wcData :String? = activity?.assets?.open("world_cup_data.json")?.bufferedReader().use {
            it?.readText()
        }

        Log.i("JJSON",""+wcData)

        val myData = Gson().fromJson(wcData,WCData::class.java)

        Log.i("GSON",""+myData)

        fixtureList =view.findViewById(R.id.rv_match_fixtures)

        fixtureList!!.setHasFixedSize(true)
        fixtureList!!.layoutManager=LinearLayoutManager(activity, VERTICAL,false)


        val wcdataModel:WCData? = myData

        val fixtureAdapter = FixtureAdapter(context!!,wcdataModel!!)
        fixtureList?.adapter=fixtureAdapter

        // Inflate the layout for this fragment
        return view
    }
}
