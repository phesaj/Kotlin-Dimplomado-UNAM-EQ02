package com.jrbco.androidbasic12.tareas.tarearicardo.registroapp

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.jrbco.androidbasic12.R
import com.jrbco.androidbasic12.tareas.tareajuan.tarea1.JuanRegistroAppRespuestaActivity

class RigelRegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rigel_registro)

        val etName = findViewById<EditText>(R.id.etName)
        val etSurname = findViewById<EditText>(R.id.etSurname)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val rgSex = findViewById<RadioGroup>(R.id.rgSex)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btSendInfo = findViewById<Button>(R.id.btSendInfo)

        // RADIOGROUP
        rgSex.setOnCheckedChangeListener { radioGroup, id ->
            val idName = getRgLabel(id, false)

        }

        btSendInfo.setOnClickListener {
            val selectedRgOption = getRgLabel(rgSex.checkedRadioButtonId, true)


            if (etName.text.toString().isEmpty()) {
                Toast.makeText(this,"Falta ingresar Nombre", Toast.LENGTH_SHORT).show()
            } else if (etSurname.text.toString().isEmpty()) {
                Toast.makeText(this,"Falta ingresar Apellido", Toast.LENGTH_SHORT).show()
            } else if (etEmail.text.toString().isEmpty()) {
                Toast.makeText(this,"Falta ingresar Correo electrónico", Toast.LENGTH_SHORT).show()
            } else if (selectedRgOption.isEmpty()) {
                Toast.makeText(this, "Falta seleccionar Género", Toast.LENGTH_SHORT).show()
            } else if (etPassword.text.toString().isEmpty()) {
                Toast.makeText(this, "Falta ingresar Contraseña", Toast.LENGTH_SHORT).show()
            }  else {
               Toast.makeText(this,"Registro exitoso", Toast.LENGTH_SHORT).show()

               val intent = Intent(this, RigelRegistroInfoActivity::class.java).apply {
                   val exName = etName.text.toString()
                   val exSurname = etSurname.text.toString()
                   val exEmail = etEmail.text.toString()
                   val exPassword = etPassword.text.toString()
                   val exSex = selectedRgOption

                   putExtra("EXTRA_NAME", exName)
                   putExtra("EXTRA_SURNAME", exSurname)
                   putExtra("EXTRA_EMAIL", exEmail)
                   putExtra("EXTRA_SEX", exSex)
                   putExtra("EXTRA_PASS", exPassword)

               }

                startActivity(intent)

            }

        }

    }


    private fun getRgLabel(id:Int, isFromButon:Boolean): String{
        return when(id) {
            R.id.rbWoman -> {
                if (isFromButon) "Mujer" else "M"
            }
            R.id.rbMan -> {
                if (isFromButon) "Hombre" else "H"
            }
            else -> ""

        }
    }

}