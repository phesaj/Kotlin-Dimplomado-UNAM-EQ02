package com.jrbco.androidbasic12.ejercicioclase.ejercicio1.tareaactivities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R
import com.jrbco.androidbasic12.ejercicioclase.ejercicio1.tareaactivities.puntosactivties1.ImplicitIntentUrlActivity
import com.jrbco.androidbasic12.ejercicioclase.ejercicio1.tareaactivities.puntosactivties1.LifeCycleTareaActivity
import com.jrbco.androidbasic12.ejercicioclase.ejercicio1.tareaactivities.puntosactivties1.SecondTareaActivity

/*
Equipo 2
Juan Jose Gonzalez Melgarejo
Ricardo Rigel Sánchez Riquelme
Joel Rodríguez Becerril
*/

class HomeTareaActivity : AppCompatActivity() {


    private val register =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK) {
                val isCorrect = result.data?.getStringExtra("resultado" )
                Toast.makeText(this, "resultExtra= $isCorrect", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "CANCELED", Toast.LENGTH_SHORT).show()
            }
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_tarea)


        val btnCircleLifeActivity = findViewById<Button>(R.id.btnLifeCycle)
        val btnYouTubeActivity = findViewById<Button>(R.id.btnImplicit)
        val btnSenActivity = findViewById<Button>(R.id.btnEnviar)



        btnSenActivity.setOnClickListener {
            val nameReg = findViewById<EditText>(R.id.editTextNombre)
            val secondName = findViewById<EditText>(R.id.editTextSecondName)
            val email = findViewById<EditText>(R.id.editTextEmail)
            val age = findViewById<EditText>(R.id.editTextAge)
            val phone = findViewById<EditText>(R.id.editTextPhone)
            val a = nameReg.text
            val b = secondName.text
            val c = email.text
            val d = age.text
            val e = phone.text
            val intent = Intent(this, SecondTareaActivity::class.java).apply {
                putExtra("name"," $a")
                putExtra("sname"," $b")
                putExtra("email"," $c")
                putExtra("age", " $d")
                putExtra("phone", " $e")
            }
            register.launch(intent)

        }

        btnCircleLifeActivity.setOnClickListener {
            val intent = Intent(this, LifeCycleTareaActivity::class.java)
            startActivity(intent)
        }

        btnYouTubeActivity.setOnClickListener {
            val intent = Intent(this, ImplicitIntentUrlActivity::class.java).apply {

            }
            startActivity(intent)
        }


    }
}