 package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondMain2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.second_main2)

        val textView: TextView =findViewById(R.id.text)

        if (intent.hasExtra("text")) {
            textView.text = intent.getStringExtra("text")
        } else {
            Toast.makeText(applicationContext, "Coming Soon", Toast.LENGTH_SHORT).show()
        }


    }
}