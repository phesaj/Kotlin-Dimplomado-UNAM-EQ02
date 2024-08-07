package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.actividad

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R

class FrameLayoutTareaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_frame_layout_tarea)

        val desayunoSpinner = findViewById<Spinner>(R.id.spinDesayuno)
        val comidaSpinner = findViewById<Spinner>(R.id.spinComida)
        val btndesayuno = findViewById<Button>(R.id.btnDesayunoOrder)
        val btncomida = findViewById<Button>(R.id.btnComidaOrder)

        val cantidades = arrayListOf("1", "2", "3", "4", "5")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, cantidades)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        desayunoSpinner.adapter = adapter
        comidaSpinner.adapter = adapter

        btndesayuno.setOnClickListener {
            val itemSpinnerSelected = desayunoSpinner.selectedItem
            Toast.makeText(this, "Se agregaron al carrito $itemSpinnerSelected desayunos", Toast.LENGTH_SHORT).show()
        }

        btncomida.setOnClickListener {
            val itemSpinnerSelected = comidaSpinner.selectedItem
            Toast.makeText(this, "Se agregaron al carrito $itemSpinnerSelected comidas", Toast.LENGTH_SHORT).show()
        }

    }
}