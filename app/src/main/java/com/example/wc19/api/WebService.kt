package com.example.wc19.api

import android.util.Log
import com.example.wc19.model.PlayerDetailsModel
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object WebService {

    const val ON_FAILURE_MESSAGE = "Seems to have some problem!, Please Check your Internet Connection and Try Again"

    fun callPlayerDetailsAPI(apiKey : String, playerID : Int, callDetailsApi : (PlayerDetailsModel?,String?)->Unit) {

        apiServices.playerDetailsAPI(apiKey,playerID).enqueue(object : Callback<PlayerDetailsModel>{
            override fun onFailure(call: Call<PlayerDetailsModel>, t: Throwable) {
                Log.d("detailsResponse",t.localizedMessage)
                callDetailsApi(null, ON_FAILURE_MESSAGE)

            }

            override fun onResponse(call: Call<PlayerDetailsModel>, response: Response<PlayerDetailsModel>) {

                Log.d("detailsResponse",Gson().toJson(response.body()))
                Log.d("detailsResponse",response.code().toString())

                if (response.isSuccessful){
                    callDetailsApi(response.body(),null)
                } else {
                    callDetailsApi(null, ON_FAILURE_MESSAGE)
                }
            }
        })
    }
}