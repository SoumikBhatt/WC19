package com.example.wc19.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.widget.Toast


fun getConnectivityStatus(context: Context): String? {

        var status: String? = null

//        var connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
//        var activeNetwork: NetworkInfo = connectivityManager.activeNetworkInfo
//
//        if (activeNetwork != null) {
//            if (activeNetwork.type == ConnectivityManager.TYPE_WIFI) {
//
//                status = "Wifi enabled"
//                return status
//            } else if (activeNetwork.type == ConnectivityManager.TYPE_MOBILE) {
//                status = "Mobile Data enabled"
//                return status
//            }
//        } else {
//            status = "No Internet Available, Please Provide Internet Connection!"
//            return status
//        }
//        return status

        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = cm.activeNetworkInfo
        val isConnected: Boolean = activeNetwork?.isConnectedOrConnecting == true

        if (isConnected){
            val isWiFi: Boolean = activeNetwork?.type == ConnectivityManager.TYPE_WIFI
            val isMobile : Boolean = activeNetwork?.type == ConnectivityManager.TYPE_MOBILE
            if (isWiFi){
                status="Wifi Enabled"
                return status
            }else if (isMobile){
                status = "Mobile data enabled"
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