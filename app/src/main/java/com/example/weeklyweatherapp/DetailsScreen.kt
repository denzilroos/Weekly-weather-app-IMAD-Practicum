package com.example.weeklyweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

lateinit var backbutton : Button
lateinit var weatherInformation : TextView

class DetailsScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_screen)

        weatherInformation = findViewById((R.id.weatherInfo))
        backbutton = findViewById(R.id.backbttn)
        //var daysCounts = 0

        //while (daysCounts < 7) {
            //weatherInformation.text = minTemps[daysCounts].toString()
            weatherInformation.text = minTemps[0].toString();"  ";maxTemps[0].toString();"  ";weatherCondition[0]
            //daysCounts += 1
        //}


        backbutton.setOnClickListener() {
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }
    }
}