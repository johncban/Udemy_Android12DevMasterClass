package com.jcb.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMe.setOnClickListener{
            //btnClickMe.text = "Haha you clicked me!"
            timesClicked = timesClicked + 1
            //tvMyTextView.text = "Haha you clicked me!"
            tvMyTextView.text = timesClicked.toString()
            Toast.makeText(this, "Hey jc!", Toast.LENGTH_LONG).show()
        }
    }
}