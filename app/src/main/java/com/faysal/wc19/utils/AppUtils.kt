package com.faysal.wc19.utils

import android.app.Activity
import android.content.Context
import android.support.v7.app.AlertDialog
import com.faysal.wc19.R
import com.kaopiz.kprogresshud.KProgressHUD

private var kProgressHUD: KProgressHUD? = null

fun showProgressBar(activity: Activity) {
    kProgressHUD = KProgressHUD.create(activity)
        .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
        .setCancellable(false)
        .setAnimationSpeed(1)
        .setDimAmount(0.5f)

    kProgressHUD?.show()
}

fun hideProgressBar() {
    if (kProgressHUD != null)
        kProgressHUD?.dismiss()
}


fun showAlertDialog(context: Context,icon:Int,title:String,message:String){

    AlertDialog.Builder(context)
        .setIcon(icon)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton("OK",null)
        .show()
}