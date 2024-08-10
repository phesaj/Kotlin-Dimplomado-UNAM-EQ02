package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.componentesgraficos.list

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jrbco.androidbasic12.R

class AnimalListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_animal_list)

        val list = findViewById<RecyclerView>(R.id.animalList)

        val data = listOf(AnimalEntity("Leon","Amarillo",""),
            AnimalEntity("Tigre","Naranja",""),
            AnimalEntity("Jirafa","Amarillo",""),
            AnimalEntity("Armadillo","Cafe",""),
            AnimalEntity("Perro","Negro",""),
            AnimalEntity("Gato","Blanco",""))

        val adapter = AnimalAdapter(data)

        adapter.onItemSelected = { animal ->

            val detailintent = Intent(this,AnimalDetailActivity::class.java).apply {
                putExtra("EXTRA_ANIMAL",animal)
            }
            startActivity(detailintent)
        //Toast.makeText(this,"nombre: ${animal.name}",Toast.LENGTH_SHORT).show()


        }

        list.adapter = adapter
        list.layoutManager = LinearLayoutManager(this)
        //list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        //list.layoutManager = GridLayoutManager(this,3)

    }
}