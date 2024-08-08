package com.jrbco.androidbasic12.tareas.tareajuan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R
import com.jrbco.androidbasic12.tareas.tareajuan.tarea1.JuanRegistroAppActivity

class JuanTareaSelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_juan_tarea_select)


        val btnTareas1 = findViewById<Button>(R.id.btnGoJuanTareas1)

        btnTareas1.setOnClickListener {
            val intent = Intent(this, JuanRegistroAppActivity::class.java)
            startActivity(intent)
        }

    }
}