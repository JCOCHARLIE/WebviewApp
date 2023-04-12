package com.example.webviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class barclayswebsite : AppCompatActivity() {
    lateinit var websitebarclays: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barclayswebsite)

        websitebarclays = findViewById(R.id.barclaysweb)
        val webSettings = websitebarclays.settings
        webSettings.javaScriptEnabled = true
        websitebarclays.loadUrl("https://barclays.com/")
    }
}