package com.jrbco.androidbasic12.ejercicioclase.ejercicio1.tareaactivities.puntosactivties1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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

class SecondTareaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_tarea)


        val labelname = findViewById<TextView>(R.id.labletareaName)
        val btnreturn = findViewById<Button>(R.id.btntareaReturn)

        intent.extras?.let {
            if (it.containsKey("EXTRA_NAME_KEY")) {
                val name = it.getString("EXTRA_NAME_KEY", "no sehjh")
                labelname.text = name
            }
            if (it.containsKey("EXTRA_NAME_KEY")) {
                val age = it.getInt("EXTRA_AGE", 0)
            }
        }

        btnreturn.setOnClickListener {
            val resultsIntent = Intent().apply {
                putExtra("EXTRA_IS_CORRECT_KEY", false)
            }

            setResult(RESULT_OK, resultsIntent)
            finish()
        }


    }
}