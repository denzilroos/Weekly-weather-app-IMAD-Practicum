package com.example.weeklyweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

/*val daysoftheweek = arrayListOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
var minTemps = arrayListOf<Int>(0,0,0,0,0,0,0)
var maxTemps = arrayListOf<Int>(0,0,0,0,0,0,0)
var weatherCondition = arrayListOf<String>("Sunny","Sunny","Sunny","Sunny","Sunny","Sunny","Sunny")*/

lateinit var submitbutton : Button
lateinit var detailScreen : Button
lateinit var minInput : EditText
lateinit var maxInput : EditText
lateinit var conditionInput : EditText
lateinit var invalidMinMsg : TextView
lateinit var invalidMaxMsg : TextView
lateinit var inputMsgMin :TextView
lateinit var inputMsgMax : TextView
lateinit var inputMsgWeather : TextView

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        submitbutton = findViewById(R.id.submitbttn)
        detailScreen = findViewById(R.id.viewDetailsBttn)

        invalidMinMsg = findViewById(R.id.invalidIntMin)
        invalidMaxMsg = findViewById(R.id.invalidIntMax)

        minInput = findViewById(R.id.minTemp)
        maxInput = findViewById(R.id.maxTemp)
        conditionInput = findViewById(R.id.weatherCondition)

        inputMsgMin = findViewById(R.id.inputDayMin)
        inputMsgMax = findViewById(R.id.inputDayMax)
        inputMsgWeather = findViewById(R.id.inputDayCondition)

        var countDays = 0

        var mintempstring = minInput.text.toString()
        var mintempnum = mintempstring.toIntOrNull()
        var maxtempstring = maxInput.text.toString()
        var maxtempnum = maxtempstring.toIntOrNull()
        var inputcondition = conditionInput.text.toString()

        //for (i: Int in 7 downTo 0 step 1){

        submitbutton.setOnClickListener() {

            for (i: Int in 7 downTo 0 step 1) {

                if (mintempnum != null) {
                    minTemps[countDays] = mintempnum

                } else {
                    invalidMinMsg.text = "Please enter a valid integer"

                }
                if (maxtempnum != null) {
                    maxTemps[countDays] = maxtempnum
                } else {
                    invalidMaxMsg.text = "Please enter a valid integer"

                }
                weatherCondition[countDays] = inputcondition
                inputMsgMin.text =
                    "Enter minimum temprature for ";daysoftheweek[countDays].toString()
                inputMsgMax.text =
                    "Enter minimum temprature for ";daysoftheweek[countDays].toString()
                inputMsgWeather.text =
                    "Enter weather condition for ";daysoftheweek[countDays].toString()
            }
             countDays += 1
            }

            detailScreen.setOnClickListener() {
                val intent = Intent(this, DetailsScreen::class.java)
                startActivity(intent)
            }
        }
    }
