package com.jrbco.androidbasic12.ejercicioclase.ejercicio1.tareaactivities.puntosactivties1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R
import kotlin.math.log

/*
Equipo no. 2
Juan Jose Gonzalez Melgarejo
Ricardo Rigel Sánchez Riquelme
Joel Rodríguez Becerril
*/

class SecondTareaActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_tarea)

        val labelname = findViewById<TextView>(R.id.LabelTareaName)
        val btnreturn = findViewById<Button>(R.id.btntareaReturn)

        intent.extras?.let {
            Log.e( "LifeCycle",  "adentro")
            if (it.containsKey("name")){
                val name = it.getString("name","no sehjh")
                val sname = it.getString("sname","no sehjh")
                val email = it.getString("email","no sehjh")
                val age = it.getString("age","no sehjh")
                val phone = it.getString("name","no sehjh")
                labelname.text= "Mi nombre es:$name $sname mi correo es: $email tengo $age años y mi numero es $phone"
            }
        }

            btnreturn.setOnClickListener {
                val resultsIntent = Intent().apply {
                    putExtra("resultado", labelname.text.toString())
                }

                setResult(RESULT_OK, resultsIntent)
                finish()
            }

    }
}