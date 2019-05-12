package com.example.wc19.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wc19.R

class PlayerDetailsAdapter : RecyclerView.Adapter<PlayerDetailsAdapter.DetailsHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): DetailsHolder {

        val view = LayoutInflater.from(p0.context).inflate(R.layout.item_player_details,p0,false)
        return DetailsHolder(view)

    }

    override fun getItemCount(): Int {

        return 0
    }

    override fun onBindViewHolder(p0: DetailsHolder, p1: Int) {

    }

    class DetailsHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    }
}