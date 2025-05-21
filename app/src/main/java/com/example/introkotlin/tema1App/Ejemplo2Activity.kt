package com.example.introkotlin.tema1App

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin.R

class Ejemplo2Activity : AppCompatActivity() {
    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var btn1: Button
    private lateinit var tv1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejemplo2sumas)
         et1 = findViewById<EditText>(R.id.et1)
         et2 = findViewById<EditText>(R.id.et2)
         btn1 = findViewById<Button>(R.id.btn1)
         tv1 = findViewById<TextView>(R.id.tv1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun multiplicacion(view:android.view.View) {
         val a = et1.text.toString().toIntOrNull()?: 0;
         val b = et2.text.toString().toIntOrNull()?: 0;
         var total = 0
         var procedimiento = ""

        //logica explicada para un a=2 * b=2

         for (i in 1..b) { // 1 menor o igual a 2?, si          ||2 eres menor o igual a 2
             total += a //total a=0+2   ||  a=2 sumate a ti mismo 2, (2+2)
              if (i == 1) {//i eres igual a 1?. si, soy igual  || i eres igual a 1?, no, soy 2
                 procedimiento = a.toString() //entonces procedimiento, guarda a "a"(2) como cadena
             } else {
                 procedimiento += "+$a" //i vales 2, no eres igual a 1, entonces,
                 //procedimiento(2) concatenate a ti mismo a(2), entonces procedimiento = "2"+"2"
             }
            //termina ciclo y vuelve a preguntar si i es menor igual a b
         }

         val resultado = "$procedimiento = $total" //resultado eres procedimiento(2+2) "=" 4
         findViewById<TextView>(R.id.tv1).text = resultado
    }   // perdon si llega a leer estos comentarios pero asi fue de la manera en que aprendi la logica
        // en programas de este tipo
}