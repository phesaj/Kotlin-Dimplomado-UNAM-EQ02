package com.jrbco.androidbasic12.tareas.tareajuan.tarea1

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R
import java.util.Calendar
import java.util.Locale

//Juan Jose Gonzalez Melgarejo

class JuanRegistroAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_juan_registro_app)


        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etApellidos = findViewById<EditText>(R.id.etApellidos)
        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val etContraseña = findViewById<EditText>(R.id.etContraseña)
        val etContraseñaConfirm = findViewById<EditText>(R.id.etContraseñaConfirm)
        val rgGenero = findViewById<RadioGroup>(R.id.rgGenero)
        val etNacimiento = findViewById<EditText>(R.id.etNacimiento)
        val etTelefono = findViewById<EditText>(R.id.etTelefono)
        val cbConfir = findViewById<CheckBox>(R.id.cbAutorizar)
        val btnRegister = findViewById<Button>(R.id.btnRegistrar)

        val textwatcher = object : TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                btnRegister.isEnabled = etNombre.text.isNotEmpty() &&
                        etApellidos.text.isNotEmpty() &&
                        etCorreo.text.isNotEmpty() &&
                        etContraseña.text.isNotEmpty() &&
                        etContraseñaConfirm.text.isNotEmpty() &&
                        rgGenero.checkedRadioButtonId != -1 &&
                        etNacimiento.text.isNotEmpty() &&
                        etTelefono.text.isNotEmpty() &&
                        cbConfir.isChecked &&
                        etContraseña.text.toString() == etContraseñaConfirm.text.toString()
            }

            override fun afterTextChanged(s: Editable?) {}
            
        }

        etNacimiento.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val locale = Locale("es", "MX")
            Locale.setDefault(locale)
            val datePickerDialog = DatePickerDialog(this, { _, selectedYear, selectedMonth, selectedDay ->
                etNacimiento.setText("$selectedDay/${selectedMonth + 1}/$selectedYear")
            }, year, month, day)

            datePickerDialog.show()
        }

        etNombre.addTextChangedListener(textwatcher)
        etApellidos.addTextChangedListener(textwatcher)
        etCorreo.addTextChangedListener(textwatcher)
        etContraseña.addTextChangedListener(textwatcher)
        etContraseñaConfirm.addTextChangedListener(textwatcher)
        etNacimiento.addTextChangedListener(textwatcher)
        etTelefono.addTextChangedListener(textwatcher)

        rgGenero.setOnCheckedChangeListener { group, id ->
            btnRegister.isEnabled = etNombre.text.isNotEmpty() &&
                    etApellidos.text.isNotEmpty() &&
                    etCorreo.text.isNotEmpty() &&
                    etContraseña.text.isNotEmpty() &&
                    etContraseñaConfirm.text.isNotEmpty() &&
                    rgGenero.checkedRadioButtonId != -1 &&
                    etNacimiento.text.isNotEmpty() &&
                    etTelefono.text.isNotEmpty() &&
                    cbConfir.isChecked &&
                    etContraseña.text.toString() == etContraseñaConfirm.text.toString()
        }


        cbConfir.setOnCheckedChangeListener { compoundButton, isChecked ->
                btnRegister.isEnabled = etNombre.text.isNotEmpty() &&
                        etApellidos.text.isNotEmpty() &&
                        etCorreo.text.isNotEmpty() &&
                        etContraseña.text.isNotEmpty() &&
                        etContraseñaConfirm.text.isNotEmpty() &&
                        rgGenero.checkedRadioButtonId != -1 &&
                        etNacimiento.text.isNotEmpty() &&
                        etTelefono.text.isNotEmpty() &&
                        cbConfir.isChecked &&
                        etContraseña.text.toString() == etContraseñaConfirm.text.toString()
            }

        btnRegister.setOnClickListener {
            val nombre = etNombre.text.toString()
            val apellidos = etApellidos.text.toString()
            val correo = etCorreo.text.toString()
            val contraseña = etContraseña.text.toString()
            val genero = findViewById<RadioButton>(rgGenero.checkedRadioButtonId).text.toString()
            val telefono = etTelefono.text.toString()
            //val genero = when(rgGenero.checkedRadioButtonId){R.id.rbFemale ->{"Mujer"}R.id.rbMale ->{"Hombre"}else ->{"rainbow"} }
            val nacimiento = etNacimiento.text.toString()

            if (!Patterns.EMAIL_ADDRESS.matcher(correo).matches()) {
                etCorreo.error = "Correo electrónico no válido"
                return@setOnClickListener
            }

            // Guardar datos en SharedPreferences
            /*
            val sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putString("nombre", nombre)
            editor.putString("apellidos", apellidos)
            editor.putString("correo", correo)
            editor.putString("contraseña", contraseña)
            editor.putString("genero", genero)
            editor.putString("nacimiento", nacimiento)
            editor.apply()
            */

            val intent = Intent(this, JuanRegistroAppRespuestaActivity::class.java).apply {

                putExtra("EXTRA_NAME_KEY_01","prueba")
                putExtra("EXTRA_AGE_01",39)
                putExtra("name", nombre)
                putExtra("lastName", apellidos)
                putExtra("email", correo)
                putExtra("password", contraseña)
                putExtra("gender", genero)
                putExtra("phone", telefono)
                putExtra("birthDate", nacimiento)
            }

            startActivity(intent)

            Toast.makeText(this, "Datos guardados correctamente $nombre,$apellidos,$correo,$contraseña,$genero,$nacimiento,$telefono", Toast.LENGTH_SHORT).show()
        }





        //cbcondicones.setOnCheckedChangeListener { compoundButton, isChecked ->
        //    btnentrar.isEnabled = isChecked
        //}


    }
}