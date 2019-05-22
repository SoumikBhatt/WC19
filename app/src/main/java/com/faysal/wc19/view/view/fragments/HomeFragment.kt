package com.faysal.wc19.view.view.fragments

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.ShareActionProvider
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout.VERTICAL
import android.widget.PopupMenu
import android.widget.Toast

import com.faysal.wc19.R
import com.faysal.wc19.adapters.FixtureAdapter
import com.faysal.wc19.model.WCData
import com.faysal.wc19.utils.showAlertDialog
import com.faysal.wc19.view.view.activities.AboutUsActivity
import com.google.gson.Gson
import kotlin.Byte as Byte1


class HomeFragment : Fragment() {

    private var fixtureList: RecyclerView? = null
    private var shareActionProvider: ShareActionProvider? = null

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

       var menuBar:ImageView = view.findViewById(R.id.iv_menu_bar)

        menuBar.setOnClickListener{
          var popUpMenu = PopupMenu(context,menuBar)

            popUpMenu.menuInflater.inflate(R.menu.menu_bar,popUpMenu.menu)

            popUpMenu.setOnMenuItemClickListener {

                if (it.itemId==R.id.about_us){

//                    showAlertDialog(context!!,R.drawable.ic_about_us,"About Us","Faysal Chowdhury\nSoumik Bhattacharjee")

                    startActivity(Intent(context,AboutUsActivity::class.java))


                } else {

                    var shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    var shareBody = "Playstore Link"
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Share Our APP")
                    shareIntent.putExtra(Intent.EXTRA_TEXT,shareBody)
                    startActivity(Intent.createChooser(shareIntent,"Share via"))
                }

                return@setOnMenuItemClickListener true
            }

            popUpMenu.show()
        }

        fixtureList!!.setHasFixedSize(true)
        fixtureList!!.layoutManager=LinearLayoutManager(activity, VERTICAL,false)


        val wcdataModel:WCData? = myData

        val fixtureAdapter = FixtureAdapter(context!!,wcdataModel!!)
        fixtureList?.adapter=fixtureAdapter

        // Inflate the layout for this fragment
        return view
    }
}
