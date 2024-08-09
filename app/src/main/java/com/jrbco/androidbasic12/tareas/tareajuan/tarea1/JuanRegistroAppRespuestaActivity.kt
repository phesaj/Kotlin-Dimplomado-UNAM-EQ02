package com.jrbco.androidbasic12.tareas.tareajuan.tarea1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R

class JuanRegistroAppRespuestaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_juan_registro_app_respuesta)


        val tvnombre = findViewById<TextView>(R.id.tvName)
        val tvapellido = findViewById<TextView>(R.id.tvLastName)
        val tvgenero = findViewById<TextView>(R.id.tvGender)
        val tvcorrero = findViewById<TextView>(R.id.tvEmail)
        val tvnacimiento = findViewById<TextView>(R.id.tvBirthDate)
        val tvtelefono = findViewById<TextView>(R.id.tvPhone)
        val tvcontraseña = findViewById<TextView>(R.id.tvPassword)






        val intent = intent
        tvnombre.text = "Nombre: " + intent.getStringExtra("name")
        tvapellido.text = "Apellido: " + intent.getStringExtra("lastName")
        tvcorrero.text = "Email: " + intent.getStringExtra("email")
        tvcontraseña.text = "Contraseña: " + intent.getStringExtra("password")
        tvgenero.text = "Género: " + intent.getStringExtra("gender")
        tvnacimiento.text = "Fecha de Nacimiento: " + intent.getStringExtra("birthDate")
        tvtelefono.text = "Teléfono: " + intent.getStringExtra("phone")

        /*
        intent.extras?.let { extras ->
            if (extras.containsKey("EXTRA_NAME_KEY_01")) {
                val name = extras.getString("EXTRA_NAME_KEY_01", "Nombre")
                tvnombre.text = name
                //Toast.makeText(this,"Mi nombre es: $name",Toast.LENGTH_SHORT).show()
            }

            tvnombre.text = "Nombre: " + intent.getStringExtra("name")

            if (extras.containsKey("EXTRA_AGE_01")) {
                val ege = extras.getInt("EXTRA_AGE_01", 0)
                //val surname = extras.getString("EXTRA_SURNAME","")
                Toast.makeText(this, "Mi edad es: $ege", Toast.LENGTH_LONG).show()
            }

        }
        */

    }
}