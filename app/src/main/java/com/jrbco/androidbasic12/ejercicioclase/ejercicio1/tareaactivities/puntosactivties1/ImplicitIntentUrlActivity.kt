package com.jrbco.androidbasic12.ejercicioclase.ejercicio1.tareaactivities.puntosactivties1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R


/*
Equipo 2
Juan Jose Gonzalez Melgarejo
Ricardo Rigel Sánchez Riquelme
Joel Rodríguez Becerril
*/


class ImplicitIntentUrlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit_intent_url)

        val btnSendUrl = findViewById<Button>(R.id.btnSendYouTube)

        btnSendUrl.setOnClickListener {
            val UrlIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=5rLmNHF2ETk"))
            startActivity(Intent.createChooser(UrlIntent,"Abrir Usando:"))
        }

    }
}