package com.example.conversor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import org.w3c.dom.Text

class TelaConversor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_conversor)

        val voltaMenu = findViewById<Button>(R.id.voltarTelaInicial)

        val txt_resultado = findViewById<TextView>(R.id.txt_resul)
        val rGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val numero = findViewById<EditText>(R.id.valor)
        val Dolar = findViewById<RadioButton>(R.id.dolar)
        val Euro = findViewById<RadioButton>(R.id.euro)
        val Yen = findViewById<RadioButton>(R.id.yen)

        val txtresul = findViewById<TextView>(R.id.resul)
        val btnCalculo = findViewById<Button>(R.id.calculo)

        voltaMenu.setOnClickListener {
            val btVoltar = Intent(this, MainActivity::class.java)
            startActivity(btVoltar)
        }

        btnCalculo.setOnClickListener {

                var FROM = "BRL"
                var TO:String =  ""




                var resultado = 0.0
                val valor = numero.text.toString()
                val checked = rGroup.checkedRadioButtonId


                if(valor == ""){
                    txtresul.text = "Digite o valor"
                }

                else if (checked == R.id.dolar){
                 //   resultado =  valor.toFloat() / 5.28
                  //  txt_resultado.text = "O valor digitado em Dolar é:"
                   // txtresul.text = " $resultado"

                } else if (checked == R.id.euro ){
                   // resultado = valor.toFloat() / 5.59
                    //txtresul.text = "O valor digitado em Euro é $ $resultado"

                }else if (checked == R.id.yen ){
                   //  resultado = 0.03975 * valor.toFloat()
                   // txtresul.text = "O valor digitado em Yen é ¥ $resultado"
                }
                else{
                    txtresul.text = "Você ja atingiu a idade para aposentar"
                }


            }
        }
    }
