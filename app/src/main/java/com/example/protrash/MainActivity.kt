package com.example.protrash

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtener referencias a los botones
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)

        // Asignar OnClickListener a cada botón
        btn1.setOnClickListener {
            Toast.makeText(this, "Botón 1 presionado", Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {
            Toast.makeText(this, "Botón 2 presionado", Toast.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener {
            Toast.makeText(this, "Botón 3 presionado", Toast.LENGTH_SHORT).show()
        }

        btn4.setOnClickListener {
            Toast.makeText(this, "Botón 4 presionado", Toast.LENGTH_SHORT).show()
        }

        // Obtener la referencia del boton
        val buttonNavigate: Button = this.findViewById(R.id.Btn_Registro)

        // Establecer un OnClickListener para el ImageButton
        buttonNavigate.setOnClickListener {
            // Crear un Intent para abrir la MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}