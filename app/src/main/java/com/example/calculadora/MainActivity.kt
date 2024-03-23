package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //INSERT CODE HERE

        val textoResultado= findViewById<TextView>(R.id.textView)

        val botonSuma= findViewById<Button>(R.id.botonSuma)
        val botonResta= findViewById<Button>(R.id.botonResta)
        val botonMultiplica= findViewById<Button>(R.id.botonMultiplicar)
        val botonDividir= findViewById<Button>(R.id.botonDividir)
        val botonResiduo= findViewById<Button>(R.id.botonResiduo)

        var numero1:  Double= findViewById<EditText>(R.id.editTextNumberDecimal).text.toString().toDouble()
        var numero2:  Double= findViewById<EditText>(R.id.editTextNumberDecimal2).text.toString().toDouble()

        botonSuma.setOnClickListener {
            var resultado=numero1+numero2
            textoResultado.text= resultado.toString()
            val toast= Toast.makeText(this,resultado.toString(),Toast.LENGTH_LONG)
            toast.show()
        }

        botonResta.setOnClickListener {
            textoResultado.text= (numero1-numero2).toString()
        }

        botonMultiplica.setOnClickListener {
            textoResultado.text= (numero1*numero2).toString()
        }

        botonDividir.setOnClickListener {
            textoResultado.text= (numero1/numero2).toString()
        }

        botonResiduo.setOnClickListener {
            textoResultado.text= (numero1%numero2).toString()
        }




    }
}