package com.faysal.wc19.view.view.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.faysal.wc19.R
import com.faysal.wc19.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_teams.view.*


class TeamsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       var view = inflater.inflate(R.layout.fragment_teams, container, false)

        val viewPager = view.view_pager
        val tabLayout = view.tl_tabs

        val adapter = ViewPagerAdapter(context!!,childFragmentManager!!)
        adapter.addFragment(TeamListFragment(),"Teams")
        adapter.addFragment(RankListFragment(),"Ranking")

        viewPager.adapter=adapter
        tabLayout.setupWithViewPager(viewPager)

        return view
    }
}
