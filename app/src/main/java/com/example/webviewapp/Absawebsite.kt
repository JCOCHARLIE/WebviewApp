package com.example.webviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Absawebsite : AppCompatActivity() {
    lateinit var websiteabsa: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_absawebsite)

        websiteabsa = findViewById(R.id.absaweb)
        val webSettings = websiteabsa.settings
        webSettings.javaScriptEnabled = true
        websiteabsa.loadUrl("https://www.absa.co.za/personal/")
    }
}