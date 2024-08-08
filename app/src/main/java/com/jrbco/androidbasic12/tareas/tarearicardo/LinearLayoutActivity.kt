package com.jrbco.androidbasic12.tareas.tarearicardo

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.jrbco.androidbasic12.R

class LinearLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout2)

        val spinnerEdif  = findViewById<Spinner>(R.id.spinnerEdif)
        val spinnerDepto = findViewById<Spinner>(R.id.spinnerDepto)

        // SPINNER EDIFICIOS
        val dataEdif = arrayListOf("Edificio A", "Edificio B", "Edificio C", "Edificio D", "Edificio E")
        val adapterEdif = ArrayAdapter(this, android.R.layout.simple_spinner_item, dataEdif).also {
            it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }

        spinnerEdif.adapter = adapterEdif

        // SPINNER DEPARTAMENTOS
        val dataDepto = arrayListOf("101", "102", "103", "104","201", "202", "203", "204","301", "302", "303", "304","401", "402", "403", "404",)
        val adapterDepto = ArrayAdapter(this, android.R.layout.simple_spinner_item, dataDepto).also {
            it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }

        spinnerDepto.adapter = adapterDepto

    }
}
