package com.example.weeklyweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var submitbutton : Button
lateinit var detailScreen : Button
class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        submitbutton = findViewById(R.id.submitbttn)
        detailScreen = findViewById(R.id.viewDetailsBttn)

        detailScreen.setOnClickListener() {
            val intent = Intent(this, DetailsScreen::class.java)
            startActivity(intent)
        }
    }
}