package com.example.webviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class citiwebsite : AppCompatActivity() {
    lateinit var websiteciti: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_citiwebsite)

        websiteciti = findViewById(R.id.citiweb)
        val webSettings = websiteciti.settings
        webSettings.javaScriptEnabled = true
        websiteciti.loadUrl("https://www.citigroup.com")
    }
}