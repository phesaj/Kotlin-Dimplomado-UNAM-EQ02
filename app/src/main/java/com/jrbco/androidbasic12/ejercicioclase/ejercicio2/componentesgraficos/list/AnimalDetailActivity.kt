package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.componentesgraficos.list

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R

class AnimalDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_animal_detail)

        val tvanimalname = findViewById<TextView>(R.id.tvAnimalName)
        val animal = intent.getSerializableExtra("EXTRA_ANIMAL") as AnimalEntity

        tvanimalname.text = animal.name
    }
}