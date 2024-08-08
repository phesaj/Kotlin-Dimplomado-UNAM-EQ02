package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.actividad

import android.R
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity



class Tarea2ViewActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(com.jrbco.androidbasic12.R.layout.activity_tarea2_view5)

        val cbGender = findViewById<CheckBox>(com.jrbco.androidbasic12.R.id.checkboxGender)
        val btnGetinfo = findViewById<Button>(com.jrbco.androidbasic12.R.id.btnGetInfo)
        val rgsex = findViewById<RadioGroup>(com.jrbco.androidbasic12.R.id.rgSex)
        val spinner = findViewById<Spinner>(com.jrbco.androidbasic12.R.id.spinner)
        val etName = findViewById<EditText>(com.jrbco.androidbasic12.R.id.etNameContact)

        //checkbox
        cbGender.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked){
                rgsex.visibility = View.GONE
            }else{
                rgsex.visibility = View.VISIBLE
            }
            Toast.makeText(this,"ischeked = $isChecked", Toast.LENGTH_LONG).show()
        }



        //radiogroup
        rgsex.setOnCheckedChangeListener { group, id ->
            val idName = when(id){
                com.jrbco.androidbasic12.R.id.rbMujer ->{"Mujer"}
                com.jrbco.androidbasic12.R.id.rbHombre ->{"Hombre"}
                else -> "Genero Fluido"
            }

            Toast.makeText(this,"Tu sexo es = $idName tu varible es $id", Toast.LENGTH_LONG).show()
        }

        //spinner
        val datos = arrayListOf("Elige un tipo de contacto","Amigo","Familia","Compañero de Trabajo")
        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,datos).also {
            it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }
        spinner.adapter = adapter

        //Error
        spinner.onItemSelectedListener = object : OnItemSelectedListener {

            override fun onItemSelected(
                p0: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val itemSelected = datos [ position]
                if (position == 0){
                    Toast.makeText(this@Tarea2ViewActivity5,"no hay item seleccionado", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this@Tarea2ViewActivity5,"Item seleccionado: $itemSelected", Toast.LENGTH_LONG).show()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@Tarea2ViewActivity5,"Nada seleccionado", Toast.LENGTH_LONG).show()
            }
        }

    }
}