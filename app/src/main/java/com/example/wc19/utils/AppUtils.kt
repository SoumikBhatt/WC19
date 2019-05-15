package com.example.wc19.utils

import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import android.support.v7.app.AlertDialog
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