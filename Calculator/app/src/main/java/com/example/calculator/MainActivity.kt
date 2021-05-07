package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onDigit(view: View)
    {
        tvUserInput.append((view as Button).text)

    }
    fun onOperator(view: View)
    {

    }

    fun onDelete(view: View)
    {
        tvUserInput.text = tvUserInput.text.drop(1)
    }

    fun onClear(view: View)
    {
        tvUserInput.text = ""
        tvResult.text = ""
    }
}