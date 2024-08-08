package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.componentesgraficos

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R

class ComponetsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_componets)

        val cbCreditCard = findViewById<CheckBox>(R.id.checkboxCreditcard)
        val btnGetinfo = findViewById<Button>(R.id.btnGetInfo)
        val rgsex = findViewById<RadioGroup>(R.id.rgSex)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val etName = findViewById<EditText>(R.id.etName)

        //checkbox
        cbCreditCard.setOnCheckedChangeListener { compoundButton, isChecked ->
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
                R.id.rbMujer ->{"Mujer"}
                R.id.rbHombre ->{"Hombre"}
                else -> "Genero Fluido"
            }

            Toast.makeText(this,"Tu sexo es = $idName tu varible es $id", Toast.LENGTH_LONG).show()
        }

        //spinner
        val datos = arrayListOf("No seleccion","Mexico","colombia","Canada","Argentina", "Dinamarca", "Venezuela", "España")
        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,datos).also {
            it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }
        spinner.adapter = adapter

        //Error
        spinner.onItemSelectedListener = object :OnItemSelectedListener {

            override fun onItemSelected(
                p0: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val itemSelected = datos [ position]
                if (position == 0){
                    Toast.makeText(this@ComponetsActivity,"no hay item seleccionado",Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this@ComponetsActivity,"Item seleccionado: $itemSelected",Toast.LENGTH_LONG).show()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@ComponetsActivity,"Nada seleccionado",Toast.LENGTH_LONG).show()
            }
        }



        btnGetinfo.setOnClickListener {
            val cbStatus = cbCreditCard.isChecked
            val sRgOpt = when(rgsex.checkedRadioButtonId){
                R.id.rbMujer ->{"woman"}
                R.id.rbHombre ->{"men"}
                else ->{"rainbow"}
            }
            val itemSpinnerSelected = spinner.selectedItem
            if(etName.text.toString().isNotEmpty()){
            Toast.makeText(this,"ischeked = $cbStatus, checkedId = $sRgOpt y selected spinner item = $itemSpinnerSelected, nombre es= ${etName.text.toString()}", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Debes ingresar tu nombre", Toast.LENGTH_LONG).show()
            }
        }

    }

    private fun getRgLabel(id:Int,isFromButton:Boolean):String{
        return when(id){
            R.id.rbMujer ->{"woman"}
            R.id.rbHombre ->{"men"}
            else ->{"rainbow"}
        }
    }

}