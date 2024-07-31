package com.jrbco.androidbasic12.ejercicioclase.ejercicio1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.jrbco.androidbasic12.R

//Juan Jose Gonzalez Melgarejo
//Rigel
//Joel

class ImplisitIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implisit_intent)

        val btnSend = findViewById<Button>(R.id.btnSend)
        val btnSendUrl = findViewById<Button>(R.id.btnSendUrl)

        btnSend.setOnClickListener{
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_SUBJECT,"Aviso Urgente")
                putExtra(Intent.EXTRA_TEXT, "Este es una mensaje prueba de email.")
            }

            startActivity(Intent.createChooser(emailIntent,"Enviar email usando: "))
        }

        btnSendUrl.setOnClickListener {
            val UrlIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://converse.com.mx"))
            startActivity(Intent.createChooser(UrlIntent,"Abrir Usando:"))
        }



    }
}