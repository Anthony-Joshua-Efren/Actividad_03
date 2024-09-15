// Nombre del Alumno: Silva Suárez Anthony Joshua Efrén
// Secuencia: 5CV50

package com.example.actividad_03

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editTextNombre = findViewById<EditText>(R.id.editTextName)
        val editTextCorreo = findViewById<EditText>(R.id.editTextEmail)
        val editTextTelefono = findViewById<EditText>(R.id.editTextPhone)
        val imageViewPerfil = findViewById<ImageView>(R.id.imageViewProfile)
        val buttonEnviar = findViewById<Button>(R.id.buttonSubmit)

        buttonEnviar.setOnClickListener{
            val nombre = editTextNombre.text.toString()
            val correo = editTextCorreo.text.toString()
            val telefono = editTextTelefono.text.toString()

            if (nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
                Toast.makeText(this, "Por favor, completa todos los campos.", Toast.LENGTH_SHORT).show()
            } else {
                imageViewPerfil.setImageResource(R.drawable.anthony)
                Toast.makeText(this, "Formulario enviado con éxito.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
