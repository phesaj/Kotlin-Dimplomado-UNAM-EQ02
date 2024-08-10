package com.jrbco.androidbasic12.tareas.tarearicardo.registroapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R

class RigelRegistroInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rigel_registro_info)
        
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvSurname = findViewById<TextView>(R.id.tvSurname)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val tvSex = findViewById<TextView>(R.id.tvSex)
        val tvPassword = findViewById<TextView>(R.id.tvPassword)

        val intent = intent
        tvName.text = "Nombre: " + intent.getStringExtra("EXTRA_NAME")
        tvSurname.text = "Apellido: " + intent.getStringExtra("EXTRA_SURNAME")
        tvSex.text = "Género: " + intent.getStringExtra("EXTRA_SEX")
        tvEmail.text = "Email: " + intent.getStringExtra("EXTRA_EMAIL")
        tvPassword.text = "Contraseña: " + intent.getStringExtra("EXTRA_PASS")

    }
}


