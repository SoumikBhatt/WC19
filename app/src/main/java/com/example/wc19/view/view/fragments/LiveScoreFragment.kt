package com.example.wc19.view.view.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.*
import com.example.wc19.utils.LIVE_SCORE_URL

import com.example.wc19.R
import com.example.wc19.utils.checkInternet
import com.example.wc19.utils.hideProgressBar
import com.example.wc19.utils.showProgressBar
import kotlinx.android.synthetic.main.fragment_live_score.view.*


class LiveScoreFragment : Fragment() {

    lateinit var liveScoreView: WebView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var view: View = inflater.inflate(R.layout.fragment_live_score, container, false)

        liveScoreView = view.wv_live_score

        checkInternet(context!!)

        var webSettings: WebSettings = liveScoreView.settings
        webSettings.javaScriptEnabled = true

        liveScoreView.loadUrl(LIVE_SCORE_URL)

        liveScoreView.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {

                if ((keyCode == KeyEvent.KEYCODE_BACK) && liveScoreView.canGoBack()) {
                    liveScoreView.goBack()
                    return true
                }
                return false
            }

        })


        showProgressBar(activity!!)

        liveScoreView.webViewClient = object : WebViewClient() {


//            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
//                if (url?.contains("icc-cricket.com")!!) {
//                    view?.loadUrl(url)
//                }
//                return true
//            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                hideProgressBar()
            }
        }


        return view
    }


}
