package com.example.conversor

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = findViewById<ImageView>(R.id.currencyImg)

        img.setOnClickListener {
            val tlConversor = Intent(this, TelaConversor::class.java)
            startActivity(tlConversor)
        }
    }
}