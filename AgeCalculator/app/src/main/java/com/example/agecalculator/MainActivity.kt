package com.example.agecalculator

import android.app.DatePickerDialog
import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import java.util.Date;

class MainActivity : AppCompatActivity() {


    private  val c = Calendar.getInstance()
    private val year = c.get(Calendar.YEAR)
    private val month = c.get(Calendar.MONTH)
    private val day = c.get(Calendar.DAY_OF_MONTH)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickedSelectDate(view: View)
    {
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
        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener
        {view, yearOfDpd, monthOfYear, dayOfMonth
            ->
            //Years
            val userCurrentYears = year - yearOfDpd
            val userCurrentYearsToString = "$userCurrentYears Years"
            val valueYears: String = userCurrentYearsToString
            val yearSs = SpannableString(valueYears)
            yearSs.setSpan(RelativeSizeSpan(4.0f), 0, valueYears.indexOf(' '), 0)
            yearSs.setSpan(ForegroundColorSpan(Color.parseColor("#bf616a")),0,valueYears.indexOf(' '),0)


            //Months
            val userCurrentMonths = (year * 12) - (yearOfDpd * 12)
            val userCurrentMonthsToString = "$userCurrentMonths Months"
            val valueMonths: String = userCurrentMonthsToString
            val monthSs = SpannableString(valueMonths)
            monthSs.setSpan(RelativeSizeSpan(3.0f), 0, valueMonths.indexOf(' '), 0)
            monthSs.setSpan(ForegroundColorSpan(Color.parseColor("#bf616a")),0,valueMonths.indexOf(' '),0)


            // Weeks
            val userCurrentWeeks = (year* 52) - (yearOfDpd * 52)
            val userCurrentWeeksToString = "$userCurrentWeeks Weeks"
            val valueWeeks: String = userCurrentWeeksToString
            val weekSs = SpannableString(valueWeeks)
            weekSs.setSpan(RelativeSizeSpan(2.5f), 0, valueWeeks.indexOf(' '), 0)
            weekSs.setSpan(ForegroundColorSpan(Color.parseColor("#bf616a")),0,valueWeeks.indexOf(' '),0)


            //Days
            val userCurrentDays = (year* 365) - (yearOfDpd * 365)
            val userCurrentDaysToString = "$userCurrentDays Days"
            val valueDays: String = userCurrentDaysToString
            val daySs = SpannableString(valueDays)
            daySs.setSpan(RelativeSizeSpan(2.5f), 0, valueDays.indexOf(' '), 0)
            daySs.setSpan(ForegroundColorSpan(Color.parseColor("#bf616a")),0,valueDays.indexOf(' '),0)


            //Hours
            val userCurrentHours = (((year) * 365) * 24)-((yearOfDpd * 365)*24)
            val userCurrentHoursToString = "$userCurrentHours Hours"
            val valueHours: String = userCurrentHoursToString
            val HourSs = SpannableString(valueHours)
            HourSs.setSpan(RelativeSizeSpan(2.0f), 0, valueHours.indexOf(' '), 0)
            HourSs.setSpan(ForegroundColorSpan(Color.parseColor("#bf616a")),0,valueHours.indexOf(' '),0)


            //Minutes
            val userCurrentMinutes = (((year * 365) * 24) * 60) - (((yearOfDpd * 365)*24) * 60)
            val userCurrentMinutesToString = "$userCurrentMinutes Minutes"
            val valueMinutes: String = userCurrentMinutesToString
            val MinuteSs = SpannableString(valueMinutes)
            MinuteSs.setSpan(RelativeSizeSpan(1.5f), 0, valueMinutes.indexOf(' '), 0)
            MinuteSs.setSpan(ForegroundColorSpan(Color.parseColor("#bf616a")),0,valueMinutes.indexOf(' '),0)



            findViewById<TextView>(R.id.tv_one).text = yearSs
            findViewById<TextView>(R.id.tv_two).text = monthSs
            findViewById<TextView>(R.id.tv_three).text = weekSs
            findViewById<TextView>(R.id.tv_four).text = daySs
            findViewById<TextView>(R.id.tv_five).text = HourSs
            findViewById<TextView>(R.id.tv_six).text = MinuteSs


        }, year, month,day)
        dpd.datePicker.maxDate = Date().time - 86400000
        dpd.show()
    }
}
