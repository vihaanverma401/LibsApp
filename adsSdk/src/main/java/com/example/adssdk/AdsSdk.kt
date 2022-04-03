package com.example.adssdk;

import android.util.Log
import com.example.utils.Util

object AdsSdk {

    private const val TAG = "AdSdk"


    fun init() {
        Log.d(TAG, "ads sdk init")
        val data = Util.getData()
        Log.d(TAG, "data : $data")
    }


}
