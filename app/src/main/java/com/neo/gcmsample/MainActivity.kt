package com.neo.gcmsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pusher.pushnotifications.PushNotifications

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PushNotifications.start(applicationContext, "67e82823-f168-4465-8b23-39ec51382ced")
        PushNotifications.addDeviceInterest("hello")
    }
}
