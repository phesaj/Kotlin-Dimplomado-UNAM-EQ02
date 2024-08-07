package com.jrbco.androidbasic12.ejercicioclase.ejercicio2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R
import com.jrbco.androidbasic12.ejercicioclase.ejercicio2.actividad.FrameLayoutTareaActivity
import com.jrbco.androidbasic12.ejercicioclase.ejercicio2.actividad.RelativeLayoutTareaActivity

class HomeEjercicio2TareaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_ejercicio2_tarea)



        val btnFrame = findViewById<Button>(R.id.btnGoFrame)
        val btnLinear = findViewById<Button>(R.id.btnGoLinear)
        val btnRelative = findViewById<Button>(R.id.btnGoRelative)
        val btnConstraint = findViewById<Button>(R.id.btnGoConstraint)
        val btnComponents = findViewById<Button>(R.id.btnGoComponents)
        val btnRecycler = findViewById<Button>(R.id.btnGoRecycler)



        btnFrame.setOnClickListener {
            val intent = Intent(this, FrameLayoutTareaActivity::class.java)
            startActivity(intent)
        }
/*

        btnLinear.setOnClickListener {
            val intent = Intent(this, HomeEjercicio2TareaActivity::class.java)
            startActivity(intent)
        }
*/

        btnRelative.setOnClickListener {
            val intent = Intent(this, RelativeLayoutTareaActivity::class.java)
            startActivity(intent)
        }


    }
}