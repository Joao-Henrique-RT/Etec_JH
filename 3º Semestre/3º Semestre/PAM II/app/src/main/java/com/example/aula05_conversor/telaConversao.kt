package com.example.aula05_conversor

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView

class telaConversao : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_conversao)


        val rGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val result = findViewById<TextView>(R.id.Resultado)
        val valor = findViewById<EditText>(R.id.editTextValor)
        val btnResult = findViewById<Button>(R.id.btnResultado)

        btnResult.setOnClickListener {
            var resultado :Double
            val valor = valor.text.toString().toDouble()
            val checked = rGroup.checkedRadioButtonId

            if(checked == R.id.rdDolar){
                resultado = valor * 5.28
                result.text = "$resultado"
            }

           if(checked == R.id.rdEuro){
                resultado = valor * 5.59
                result.text = "$resultado"
            }

            if(checked == R.id.rdYemen){
                resultado = valor * 0.039750
                result.text = "$resultado"
            }
        }
   }
}