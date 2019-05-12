package com.example.wc19.view.view.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.wc19.R
import com.example.wc19.utils.LIVE_STREAM_URL
import com.example.wc19.utils.hideProgressBar
import com.example.wc19.utils.showProgressBar
import kotlinx.android.synthetic.main.activity_live_stream.*

class LiveStreamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_stream)

        var webSettings: WebSettings = wv_live_stream.settings
        webSettings.javaScriptEnabled = true

        wv_live_stream.loadUrl(LIVE_STREAM_URL)

        wv_live_stream.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {

                if ((keyCode == KeyEvent.KEYCODE_BACK) && wv_live_stream.canGoBack()) {
                    wv_live_stream.goBack()
                    return true
                }
                return false
            }

        })


        showProgressBar(this)

        wv_live_stream.webViewClient = object : WebViewClient() {


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
    }
}
