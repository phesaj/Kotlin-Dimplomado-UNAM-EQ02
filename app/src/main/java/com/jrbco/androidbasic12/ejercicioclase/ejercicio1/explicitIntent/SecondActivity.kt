package com.jrbco.androidbasic12.ejercicioclase.ejercicio1.explicitIntent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val lableName = findViewById<TextView>(R.id.lableName)
        val btnReturn = findViewById<Button>(R.id.btnReturn)

        val name = intent.extras?.let {extras->


            if(extras.containsKey("EXTRA_NAME_KEY")){
                val name = extras.getString("EXTRA_NAME_KEY","")
                lableName.text=name
                //Toast.makeText(this,"Mi nombre es: $name",Toast.LENGTH_SHORT).show()
            }


            if(extras.containsKey("EXTRA_AGE")){

                val ege = extras.getInt("EXTRA_AGE",0)
                //val surname = extras.getString("EXTRA_SURNAME","")
                Toast.makeText(this,"Mi edad es: $ege",Toast.LENGTH_LONG).show()
            }

           btnReturn.setOnClickListener {
               val resultIntent = Intent().apply{
                   putExtra("EXTRA_IS_CORRECT_KEY",true)
               }

               setResult(RESULT_OK,resultIntent)
               finish()
           }

        }

    }
}