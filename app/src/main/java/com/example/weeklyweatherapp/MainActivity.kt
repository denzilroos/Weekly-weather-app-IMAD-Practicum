package com.example.weeklyweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
val daysoftheweek = arrayOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
var minTemps = arrayOf<Int>(0,0,0,0,0,0,0)
var maxTemps = arrayOf<Int>(0,0,0,0,0,0,0)
var weatherCondition = arrayOf<String>("Sunny","Sunny","Sunny","Sunny","Sunny","Sunny","Sunny")

lateinit var mainbttn : Button
lateinit var exitbutton : Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainbttn = findViewById(R.id.mainscrnbttn)
        exitbutton = findViewById(R.id.exitbttn)

        mainbttn.setOnClickListener(){
            val intent = Intent(this,MainScreen::class.java)
            startActivity(intent)
        }
        exitbutton.setOnClickListener{
            finish()
            System.exit(0)
        }
    }


}