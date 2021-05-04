package com.example.agecalculator

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {


    private  val c = Calendar.getInstance()
    private val year = c.get(Calendar.YEAR)
    private val month = c.get(Calendar.MONTH)
    private val day = c.get(Calendar.DAY_OF_MONTH)
    private val hour = c.get(Calendar.HOUR)
    private val min = c.get(Calendar.MINUTE)
    private val sec = c.get(Calendar.SECOND)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun clickedSelectDate(view: View)
    {
        val s = "Hello Kotlin"
        val ss = SpannableString(s)
        ss.setSpan(RelativeSizeSpan(2f),0,5,0)
        ss.setSpan(ForegroundColorSpan(Color.RED), 0,5,0)
        findViewById<TextView>(R.id.tv_one).text = ss



        findViewById<TextView>(R.id.tv_three).text = "$day"
        findViewById<TextView>(R.id.tv_four).text = "$hour"
        findViewById<TextView>(R.id.tv_five).text ="$min"
        findViewById<TextView>(R.id.tv_six).text = "$sec"

        calenderPicker(view)

    }

    fun clickedReset(view: View)
    {
        findViewById<TextView>(R.id.tv_one).text = ""
        findViewById<TextView>(R.id.tv_two).text = ""
        findViewById<TextView>(R.id.tv_three).text = ""
        findViewById<TextView>(R.id.tv_four).text = ""
        findViewById<TextView>(R.id.tv_five).text = ""
        findViewById<TextView>(R.id.tv_six).text = ""
    }


    private fun calenderPicker(view: View)
    {
        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{view, yearOfDpd, monthOfYear, dayOfMonth
        ->
            findViewById<TextView>(R.id.tv_two).text = "$yearOfDpd"
            findViewById<TextView>(R.id.tv_one).text = "$yearOfDpd"
        }, year, month,day)
        dpd.show()
    }
}
