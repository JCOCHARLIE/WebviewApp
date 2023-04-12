package com.example.webviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class stanchart : AppCompatActivity() {
    lateinit var websitestanchart:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stanchart)

        websitestanchart = findViewById(R.id.stanchartweb)
        val webSettings = websitestanchart.settings
        webSettings.javaScriptEnabled = true
        websitestanchart.loadUrl("https://sc.com")
    }
}