package com.example.introkotlin.tema1App

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin.R
import java.text.NumberFormat
import java.util.Locale

class cine : AppCompatActivity() {

    private lateinit var etNombre: EditText
    private lateinit var etCompradores: EditText
    private lateinit var etBoletos: EditText
    private lateinit var rbSi: RadioButton
    private lateinit var tvTotalPagar: TextView
    private lateinit var btnCalcular: Button

    private val precioBoleto = 12000.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cine)

        etNombre = findViewById(R.id.etNombre)
        etCompradores = findViewById(R.id.etCompradores)
        etBoletos = findViewById(R.id.etBoletos)
        rbSi = findViewById(R.id.rbSi)
        tvTotalPagar = findViewById(R.id.tvTotalPagar)
        btnCalcular = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener { calcular(it) }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
    @SuppressLint("SetTextI18n")
    fun calcular(view: View) {


            val boletos = etBoletos.text.toString().toInt()
        val compradores = etCompradores.text.toString().toIntOrNull() ?:0
        val maxBoletos = compradores * 7
        if (boletos > maxBoletos) {
            tvTotalPagar.text = "solo puedes comprar 7 boletos por persona"
            return
        }


            val tarjetaCineco = rbSi.isChecked
            var total = boletos * precioBoleto


            if (boletos > 5) {
                total *= 0.85 //multiplicando por ejemplo 7200 * 1 seria 7200, pero si restamos 15 al 1, estamos multiplicando por un numero menor a 1 por lo cual quedaria 61200, osea 15% menos
            } else if (boletos in 3..5) {
                total *= 0.90
            }

            if (tarjetaCineco) { //nota: como es radioButton el atributo directamente es boolean
                total *= 0.90
            }


        tvTotalPagar.text = total.toString()
    }
    }

