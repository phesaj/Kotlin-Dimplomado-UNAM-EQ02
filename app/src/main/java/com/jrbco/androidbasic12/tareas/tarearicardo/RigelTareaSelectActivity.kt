package com.jrbco.androidbasic12.tareas.tarearicardo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.jrbco.androidbasic12.R
import com.jrbco.androidbasic12.tareas.tarearicardo.registroapp.RigelRegistroActivity


class RigelTareaSelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rigel_tarea_select)

        val btnTareas1 = findViewById<Button>(R.id.btnGoRigelTareas1)

        btnTareas1.setOnClickListener {
            val intent = Intent(this, RigelRegistroActivity::class.java)
            startActivity(intent)
        }

    }
}