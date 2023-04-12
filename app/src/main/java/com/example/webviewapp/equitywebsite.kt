package com.example.webviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class equitywebsite : AppCompatActivity() {
    lateinit var websiteequity: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equitywebsite)

        websiteequity = findViewById(R.id.equityweb)
        val webSettings = websiteequity.settings
        webSettings.javaScriptEnabled = true
        websiteequity.loadUrl("https://equitybank.com")
    }
}