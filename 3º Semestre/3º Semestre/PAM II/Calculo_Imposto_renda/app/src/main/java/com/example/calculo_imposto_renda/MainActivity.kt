package com.example.calculo_imposto_renda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt_salario = findViewById<EditText>(R.id.txt_salario)
        val btn_calculo = findViewById<Button>(R.id.btn_Calculo)
        var txt_resultado = findViewById<TextView>(R.id.txt_resultado)

        btn_calculo.setOnClickListener {
            var valor1 = txt_salario.text.toString()

            if(valor1.toFloat() < 1903.98){
                txt_resultado.text = "Isento"
            }else if(valor1.toFloat() > 1903.98 && < 2826.65){
                
            }

        }




    }
}