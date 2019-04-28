package com.example.wc19.adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(context: Context,manager : FragmentManager) : FragmentPagerAdapter(manager) {

    private val fragmentList:MutableList<Fragment> = ArrayList<Fragment>()
    private val titleList:MutableList<String> = ArrayList()

    override fun getItem(p0: Int): Fragment {

        return fragmentList[p0]
        //returns the fragment
    }

    override fun getCount(): Int {

        return fragmentList.size
        //returns size of the item
    }

    fun addFragment(fragment: Fragment,title:String){

        fragmentList.add(fragment)
        titleList.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }
}