package com.jrbco.androidbasic12.ejercicioclase

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R
import com.jrbco.androidbasic12.ejercicioclase.ejercicio1.tareaactivities.HomeTareaActivity
import com.jrbco.androidbasic12.ejercicioclase.ejercicio1.tareaactivities.puntosactivties1.LifeCycleTareaActivity
import com.jrbco.androidbasic12.ejercicioclase.ejercicio2.HomeEjercicio2TareaActivity
import com.jrbco.androidbasic12.tareas.HomeTareasJujoRiActivity

class MainHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_home)

        val btnTareasActivity = findViewById<Button>(R.id.btnGoTareas)
        val btnEjercicio2Activity = findViewById<Button>(R.id.btnGoEjercicio2)
        val btnEjercicio1Activity = findViewById<Button>(R.id.btnGoEjercicio1)



        btnTareasActivity.setOnClickListener {
            val intent = Intent(this, HomeTareasJujoRiActivity::class.java)
            startActivity(intent)
        }

        btnEjercicio2Activity.setOnClickListener {
            val intent = Intent(this, HomeEjercicio2TareaActivity::class.java)
            startActivity(intent)
        }

        btnEjercicio1Activity.setOnClickListener {
            val intent = Intent(this, HomeTareaActivity::class.java)
            startActivity(intent)
        }
    }
}