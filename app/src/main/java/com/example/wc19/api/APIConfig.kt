package com.example.wc19.api

import com.example.wc19.utils.API_BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

var apiServices = ApiConfig().apiServices

class ApiConfig{

    var retrofit:Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(API_BASE_URL)
        .build()

    var apiServices:ApiServices = retrofit.create(ApiServices::class.java)
}