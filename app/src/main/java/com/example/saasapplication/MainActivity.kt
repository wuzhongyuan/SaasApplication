package com.example.saasapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.saasapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("wzy", "onCreate: packageName = $packageName")
        val textViewName = findViewById<TextView>(R.id.tv_version_name)
        textViewName.text = BuildConfig.VERSION_NAME
        val textViewCode= findViewById<TextView>(R.id.tv_version_code)
        textViewCode.text = BuildConfig.VERSION_CODE.toString()
    }
}