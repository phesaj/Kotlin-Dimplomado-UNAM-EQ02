package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.actividad

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R

class RelativeLayoutTareaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_relative_layout_tarea)


        val btnentrar = findViewById<Button>(R.id.btnEntrar)
        val etnombre = findViewById<EditText>(R.id.etNombre)
        val etapellido = findViewById<EditText>(R.id.etApellidos)
        val ettelefono = findViewById<EditText>(R.id.etTelefono)
        val etcorreo = findViewById<EditText>(R.id.etCorreo)
        val etdireccion = findViewById<EditText>(R.id.etDireccion)
        val cbcondicones = findViewById<CheckBox>(R.id.checkboxAutorizar)
        val rgsex = findViewById<RadioGroup>(R.id.rgSex)


        cbcondicones.setOnCheckedChangeListener { compoundButton, isChecked ->
            btnentrar.isEnabled = isChecked
        }

        btnentrar.setOnClickListener {
            val cbStatus = cbcondicones.isChecked
            val sRgOpt = when(rgsex.checkedRadioButtonId){
                R.id.rbMujer ->{"Mujer"}
                R.id.rbHombre ->{"Hombre"}
                else ->{"Fluido"}
            }
            if(etnombre.text.toString().isNotEmpty()){
                Toast.makeText(this,"Tu tienes permitido entrar", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Debes ingresar tu nombre", Toast.LENGTH_LONG).show()
            }
        }




    }
}