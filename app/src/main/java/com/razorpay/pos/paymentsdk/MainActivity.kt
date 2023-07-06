package com.razorpay.pos.paymentsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.razorpay.pos.paymentsdk.MyLog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyLog().displayLog()
    }
}