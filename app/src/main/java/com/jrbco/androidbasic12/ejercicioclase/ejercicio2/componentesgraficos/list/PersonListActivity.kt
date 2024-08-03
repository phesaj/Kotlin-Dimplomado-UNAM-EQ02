package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.componentesgraficos.list

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jrbco.androidbasic12.R

class PersonListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_person_list)

        val list = findViewById<RecyclerView>(R.id.personList)

        val data = listOf(PersonEntity("Juan Jose","Gonzalez",453,"asdfasdasd"),
            PersonEntity("Juan Jose","Gonzalez",453,"asdfasdasd"),
            PersonEntity("Juan Jose","Gonzalez",453,"asdfasdasd"),
            PersonEntity("Juan Jose","Gonzalez",453,"asdfasdasd"))

        val adapter = PersonAdapter(data)
        list.adapter = adapter
        list.layoutManager = LinearLayoutManager(this)
        //list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        //list.layoutManager = GridLayoutManager(this,3)

    }
}