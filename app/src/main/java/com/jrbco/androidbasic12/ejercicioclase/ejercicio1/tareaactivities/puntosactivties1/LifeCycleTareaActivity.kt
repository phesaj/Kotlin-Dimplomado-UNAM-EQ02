package com.jrbco.androidbasic12.ejercicioclase.ejercicio1.tareaactivities.puntosactivties1

import android.os.Bundle
//import android.util.Log
import android.widget.Toast
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

class LifeCycleTareaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_life_cycle_tarea)

        Toast.makeText(this, "Se aplico el metodo onCreate", Toast.LENGTH_LONG).show()

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Se aplico el metodo onStart", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Se aplico el metodo onResume", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Se aplico el metodo onPause", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Se aplico el metodo onStop", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "Se aplico el metodo onRestart", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Se aplico el metodo onDestroy", Toast.LENGTH_LONG).show()
    }


}