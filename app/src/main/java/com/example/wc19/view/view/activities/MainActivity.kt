package com.example.wc19.view.view.activities

import android.app.Activity
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.widget.Toast
import com.example.wc19.R
import com.example.wc19.utils.getConnectivityStatus
import com.example.wc19.view.view.fragments.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, HomeFragment()).commit()

        nav_bottom.setOnNavigationItemSelectedListener { menuItem ->

            var selectedFragment: Fragment? = null

            when(menuItem.itemId){

                R.id.nav_res_home -> selectedFragment = HomeFragment()
                R.id.nav_res_teams -> selectedFragment = TeamsFragment()
                R.id.nav_res_live_tv -> selectedFragment = LiveTVFragment()
                R.id.nav_res_live_score -> selectedFragment = LiveScoreFragment()
                R.id.nav_res_live_points_table -> selectedFragment = PointsTableFragment()
            }

            supportFragmentManager.beginTransaction().replace(R.id.fragment_container,selectedFragment!!).commit()
            true

        }



    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setIcon(R.drawable.ic_alert)
            .setTitle("Closing The App")
            .setMessage("Do you really want to exit?")
            .setPositiveButton("Yes") { _, _ -> finish() }
            .setNegativeButton("No",null)
            .show()
    }
}
