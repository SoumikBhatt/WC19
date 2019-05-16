package com.faysal.wc19.api

import com.faysal.wc19.model.PlayerDetailsModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

    @GET("playerStats")
    fun playerDetailsAPI(@Query("apikey") apiKey:String, @Query("pid") playerID:Int):Call<PlayerDetailsModel>
}