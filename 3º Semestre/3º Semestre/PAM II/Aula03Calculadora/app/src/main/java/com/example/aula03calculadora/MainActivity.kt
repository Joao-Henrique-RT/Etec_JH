package com.example.aula03calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val txt_num1 = findViewById<EditText>(R.id.txt_num1)
    val txt_num2 = findViewById<EditText>(R.id.txt_num2)
    val btn_soma = findViewById<Button>(R.id.btn_soma)
    val btn_subtracao = findViewById<Button>(R.id.btn_subtracao)
    val btn_divisao = findViewById<Button>(R.id.btn_divisao)
    val btn_multiplicacao = findViewById<Button>(R.id.btn_multiplicacao)
    val txt_resultado = findViewById<TextView>(R.id.txt_resultado)
    val btn_limpar = findViewById<Button>(R.id.btn_limpar)

    btn_soma.setOnClickListener {
        var resultado = 0
      val n1 =  txt_num1.text.toString()
      val n2 =  txt_num2.text.toString()

      resultado = n1.toInt() + n2.toInt()

      txt_resultado.text = "$resultado"
    }

        btn_subtracao.setOnClickListener {
            var resultado = 0
            val n1 =  txt_num1.text.toString()
            val n2 =  txt_num2.text.toString()

            resultado = n1.toInt() - n2.toInt()

            txt_resultado.text = "$resultado"
        }

        btn_divisao.setOnClickListener {
            var resultado = 0.0
            val n1 =  txt_num1.text.toString()
            val n2 =  txt_num2.text.toString()

            resultado = n1.toDouble() / n2.toDouble()

            txt_resultado.text = "$resultado"
        }

        btn_multiplicacao.setOnClickListener {
            var resultado = 0
            val n1 =  txt_num1.text.toString()
            val n2 =  txt_num2.text.toString()

            resultado = n1.toInt() * n2.toInt()

            txt_resultado.text = "$resultado"
        }

    btn_limpar.setOnClickListener {
        txt_num1.setText("")
        txt_num2.setText("")
        txt_resultado.text = ""
    }















    }
}