package com.faysal.wc19.view.view.fragments

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.faysal.wc19.R
import com.faysal.wc19.utils.checkInternet
import com.faysal.wc19.view.view.activities.LiveStreamActivity
import com.faysal.wc19.view.view.activities.SonyLivActivity
import com.faysal.wc19.view.view.activities.YoutubeStreamActivity
import kotlinx.android.synthetic.main.fragment_live_tv.view.*


class LiveTVFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      var view =  inflater.inflate(R.layout.fragment_live_tv, container, false)

        val live_gtv = view.cv_gtv
        val live_sony_liv = view.cv_sony_liv
        val live_btv = view.cv_btv
        val live_star_sports = view.cv_star_sports
        val live_masranga = view.cv_masranga

        live_gtv.setOnClickListener(View.OnClickListener {

            checkInternet(context!!)
            var intent = Intent(context,YoutubeStreamActivity::class.java)
            startActivity(intent)
        })

        live_sony_liv.setOnClickListener(View.OnClickListener {
            checkInternet(context!!)
           var intent = Intent(context, SonyLivActivity::class.java)
            startActivity(intent)
        })

        live_btv.setOnClickListener(View.OnClickListener {
            checkInternet(context!!)
            var intent = Intent(context, LiveStreamActivity::class.java)
            startActivity(intent)
        })

        live_masranga.setOnClickListener(View.OnClickListener {
            checkInternet(context!!)
            var intent = Intent(context, LiveStreamActivity::class.java)
            startActivity(intent)
        })

        live_star_sports.setOnClickListener(View.OnClickListener {
            checkInternet(context!!)
            var intent = Intent(context, LiveStreamActivity::class.java)
            startActivity(intent)
        })

        return view
    }
}
