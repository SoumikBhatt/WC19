package com.faysal.wc19.view.view.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import com.faysal.wc19.R
import mehdi.sakout.aboutpage.AboutPage
import mehdi.sakout.aboutpage.Element
import java.util.*

class AboutUsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var aboutElement = Element()

        aboutElement.title="About Us"

       var aboutPage: View = AboutPage(this)
           .isRTL(false)
           .setImage(R.drawable.about)
           .setDescription("Faysal Chowdhury\nSoumik Bhattacharjee")
           .addGroup("Connect With us")
           .addEmail("piyal.developer@gmail.com")
           .addGitHub("SoumikBhatt")
           .addItem(createCopyright())
           .create()

        setContentView(aboutPage)


    }

    private fun createCopyright(): Element? {

        val copyright = Element()
        val copyrightString = String.format("Copyright %d by Joy Bangla", Calendar.getInstance().get(Calendar.YEAR))
        copyright.title=copyrightString
        copyright.iconDrawable=R.drawable.ic_copyright
        copyright.gravity=Gravity.CENTER

        return copyright
    }
}
