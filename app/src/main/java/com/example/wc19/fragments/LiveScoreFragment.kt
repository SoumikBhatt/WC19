package com.example.wc19.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.text.method.DigitsKeyListener
import android.text.method.TextKeyListener
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.wc19.R
import kotlinx.android.synthetic.main.fragment_live_score.*
import kotlinx.android.synthetic.main.fragment_live_score.view.*


class LiveScoreFragment : Fragment() {

var len:Int ?= 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var view:View =  inflater.inflate(R.layout.fragment_live_score, container, false)


        return view
    }
}
