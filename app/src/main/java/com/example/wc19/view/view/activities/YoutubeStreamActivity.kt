package com.example.wc19.view.view.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.wc19.R
import com.example.wc19.utils.DEVELOPER_KEY
import com.example.wc19.utils.GTV_LIVE
import com.example.wc19.utils.hideProgressBar
import com.example.wc19.utils.showProgressBar
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_youtube_stream.*

class YoutubeStreamActivity : YouTubeBaseActivity() {

    lateinit var youtubePlayerInit:YouTubePlayer.OnInitializedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube_stream)

        initYoutubePlayer()
        youtube_player.initialize(DEVELOPER_KEY,youtubePlayerInit)
        showProgressBar(this)

    }

    private fun initYoutubePlayer() {
        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
                p1?.loadVideo(GTV_LIVE)
                hideProgressBar()
            }

            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
                Toast.makeText(applicationContext, "Something Went Wrong!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
