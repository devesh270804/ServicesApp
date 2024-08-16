package com.example.servicesapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start:Button=findViewById(R.id.button_play)
        val stop:Button=findViewById(R.id.button_stop)

        start.setOnClickListener {
            val startServiceIntent= Intent(applicationContext,MyService::class.java)
            startService(startServiceIntent)
        }
        stop.setOnClickListener {
            val stopServiceIntent= Intent(applicationContext,MyService::class.java)
            stopService(stopServiceIntent)
        }

    }
}