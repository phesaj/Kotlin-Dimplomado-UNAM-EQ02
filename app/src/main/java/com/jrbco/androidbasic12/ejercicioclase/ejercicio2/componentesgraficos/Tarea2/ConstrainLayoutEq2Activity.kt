package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.componentesgraficos.Tarea2

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R

class ConstrainLayoutEq2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_constrain_layout_eq2)



            // Registering ID's
            val textView = findViewById<TextView>(R.id.Edittext)
            val Edittext2 = findViewById<TextView>(R.id.Edittext2)
            val calenderView = findViewById<CalendarView>(R.id.CalendarC)

            // using setonDateChangeListener
            calenderView.setOnDateChangeListener { view, year, month, dayOfMonth ->
                val date = "$dayOfMonth/$month/$year"

                // changing the textview
                // data to selected date
                if(textView.length() == 0)
                    {
                        textView.text = date
                    }else{
                        Edittext2.text =date
                    }
            }

            // for changing the background color of title bar
//            val aBar = supportActionBar
//            val cd = ColorDrawable(Color.parseColor("#FF00FF00"))
//            aBar?.setBackgroundDrawable(cd)



    }
}