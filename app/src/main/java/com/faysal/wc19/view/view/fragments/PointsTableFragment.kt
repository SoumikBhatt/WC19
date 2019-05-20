package com.faysal.wc19.view.view.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.faysal.wc19.*
import com.faysal.wc19.utils.POINTS_TABLE_URL
import com.faysal.wc19.utils.checkInternet
import com.faysal.wc19.utils.hideProgressBar
import com.faysal.wc19.utils.showProgressBar

import kotlinx.android.synthetic.main.fragment_points_table.view.*

class PointsTableFragment : Fragment() {

    lateinit var pointsTableView:WebView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_points_table, container, false)

        pointsTableView = view.wv_points_table

        checkInternet(context!!)

        var webSettings: WebSettings = pointsTableView.settings
        webSettings.javaScriptEnabled= true

        pointsTableView.loadUrl(POINTS_TABLE_URL)

        pointsTableView.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {

                if ((keyCode == KeyEvent.KEYCODE_BACK) && pointsTableView.canGoBack()) {
                    pointsTableView.goBack()
                    return true
                }
                return false
            }

        })


//        showProgressBar(activity!!)

        pointsTableView.webViewClient= object : WebViewClient(){



//            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
//                if (url?.contains("cricketworldcup.com")!!) {
//                    view?.loadUrl(url)
//                }
//                return true
//            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
//                hideProgressBar()
            }
        }


        return view
    }
}
