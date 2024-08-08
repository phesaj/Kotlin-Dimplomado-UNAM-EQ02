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
import com.jrbco.androidbasic12.ejercicioclase.ejercicio2.actividad.Tarea2ViewActivity5
import com.jrbco.androidbasic12.ejercicioclase.ejercicio2.componentesgraficos.Tarea2.ConstrainLayoutEq2Activity
import com.jrbco.androidbasic12.tareas.tarearicardo.LinearLayoutActivity
import com.jrbco.androidbasic12.tareas.tarearicardo.list.MarketListActivity

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


        btnLinear.setOnClickListener {
            val intent = Intent(this, LinearLayoutActivity::class.java)
            startActivity(intent)
        }
        btnRecycler.setOnClickListener {
            val intent = Intent(this, MarketListActivity::class.java)
            startActivity(intent)
        }

        btnFrame.setOnClickListener {
            val intent = Intent(this, FrameLayoutTareaActivity::class.java)
            startActivity(intent)
        }

        btnConstraint.setOnClickListener {
            val intent = Intent(this, ConstrainLayoutEq2Activity::class.java)
            startActivity(intent)
        }

        btnComponents.setOnClickListener {
            val intent = Intent(this, Tarea2ViewActivity5::class.java)
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