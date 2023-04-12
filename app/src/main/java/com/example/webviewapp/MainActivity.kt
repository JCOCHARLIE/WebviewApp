package com.example.webviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var absaclick:ImageView
    private lateinit var barclayclick:ImageView
    private lateinit var citiclick:ImageView
    private lateinit var equityclick:ImageView
    private lateinit var stanchartclick:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        absaclick = findViewById(R.id.absa)
        barclayclick = findViewById(R.id.barclays)
        citiclick = findViewById(R.id.citi)
        equityclick = findViewById(R.id.equity)
        stanchartclick = findViewById(R.id.stanchart)

        absaclick.setOnClickListener{
            val gotowebsite = Intent(this, Absawebsite::class.java)
            startActivity(gotowebsite)
        }

        barclayclick.setOnClickListener{
            val gotowebsite = Intent(this, barclayswebsite::class.java)
            startActivity(gotowebsite)
        }

        citiclick.setOnClickListener{
            val gotowebsite = Intent(this, citiwebsite::class.java)
            startActivity(gotowebsite)
        }

        equityclick.setOnClickListener{
            val gotowebsite = Intent(this, equitywebsite::class.java)
            startActivity(gotowebsite)
        }

        stanchartclick.setOnClickListener{
            val gotowebsite = Intent(this, stanchart::class.java)
            startActivity(gotowebsite)
        }
    }
}