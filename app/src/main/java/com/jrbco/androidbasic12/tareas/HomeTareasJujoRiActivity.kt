package com.jrbco.androidbasic12.tareas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.jrbco.androidbasic12.R
import com.jrbco.androidbasic12.tareas.tareajuan.JuanTareaSelectActivity
import com.jrbco.androidbasic12.tareas.tarearicardo.RigelTareaSelectActivity

class HomeTareasJujoRiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_tareas_jujo_ri)

        val btnTareasRicar = findViewById<Button>(R.id.btnGoTareasRi)
        val btnTareasJuan = findViewById<Button>(R.id.btnGoTareasJuan)
        val btnTareasJoel = findViewById<Button>(R.id.btnGoTareasJoel)



        btnTareasRicar.setOnClickListener {
            val intent = Intent(this, RigelTareaSelectActivity::class.java)
            startActivity(intent)
        }

        btnTareasJuan.setOnClickListener {
            val intent = Intent(this, JuanTareaSelectActivity::class.java)
            startActivity(intent)
        }
/*
        btnTareasJoel.setOnClickListener {
            val intent = Intent(this, ::class.java)
            startActivity(intent)
        }
        */
    }
}