package com.example.weeklyweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var backbutton : Button

class DetailsScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_screen)

        backbutton = findViewById(R.id.backbttn)

        backbutton.setOnClickListener() {
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }
    }
}