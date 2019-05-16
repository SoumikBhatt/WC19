package com.example.wc19.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.widget.Toast


fun getConnectivityStatus(context: Context): String? {

        var status: String? = null

        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = cm.activeNetworkInfo
        val isConnected: Boolean = activeNetwork?.isConnectedOrConnecting == true

        if (isConnected){
            val isWiFi: Boolean = activeNetwork?.type == ConnectivityManager.TYPE_WIFI
            val isMobile : Boolean = activeNetwork?.type == ConnectivityManager.TYPE_MOBILE
            if (isWiFi){
                status="Redirecting to Server"
                return status
            }else if (isMobile){
                status = "Redirecting to Server"
                return status
            }
        } else{
            status = "No Internet Available, Please Provide Internet Connection!"
            return status
        }
        return status
    }

fun checkInternet (context: Context){

    var status = getConnectivityStatus(context)

    if (status?.isEmpty()!!){
        status = "No Internet Available, Please Provide Internet Connection!"
    }

    Toast.makeText(context,status, Toast.LENGTH_SHORT).show()
}