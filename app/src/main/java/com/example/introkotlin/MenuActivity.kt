package com.example.introkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin.R.id.btn1
import com.example.introkotlin.R.id.btn2
import com.example.introkotlin.tema1App.Ejemplo1Activity
import com.example.introkotlin.tema1App.cine
import com.example.introkotlin.tema2App.Ejemplo2Activity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnEjemplo1 = findViewById<Button>(btn1)
        val btnEjemplo2 = findViewById<Button>(btn2)
        val btnEjemplo3 = findViewById<Button>(R.id.btn3)

        btnEjemplo1.setOnClickListener { navegateToEjemplo1() }
        btnEjemplo2.setOnClickListener { navegateToCine() }
        btnEjemplo3.setOnClickListener { navegateToEjemplo3() }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navegateToEjemplo1(){
        val intent = Intent(this, Ejemplo1Activity::class.java)
        startActivity(intent)
    }
    private fun navegateToCine(){
        val intent = Intent(this, cine::class.java)
        startActivity(intent)
    }
    private fun navegateToEjemplo3(){
        val intent = Intent(this, Ejemplo2Activity::class.java)
        startActivity(intent)
    }
}

