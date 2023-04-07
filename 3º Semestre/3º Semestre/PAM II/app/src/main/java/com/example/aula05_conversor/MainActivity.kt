package com.example.aula05_conversor

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt = findViewById<ImageView>(R.id.imgTroca)

        txt.setOnClickListener {
            val tlConversor = Intent (this, telaConversao::class.java)
            startActivity(tlConversor)

        }






    }
}