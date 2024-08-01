package com.jrbco.androidbasic12.ejercicioclase.ejercicio1.tareaactivities.puntosactivties1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R

/*
Equipo 2
Juan Jose Gonzalez Melgarejo
Ricardo Rigel Sánchez Riquelme
Joel Rodríguez Becerril
*/

class SecondTareaActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_tarea)

        val labelname = findViewById<TextView>(R.id.UserDataName)
        val btnreturn = findViewById<Button>(R.id.btntareaReturn)

        intent.extras?.let {
            if (it.containsKey("EXTRA_NAME_KEY")){
                val name = it.getString("EXTRA_NAME_KEY","no sehjh")
                labelname.text=name
            }
            if (it.containsKey("EXTRA_NAME_KEY")){
                val age = it.getInt("EXTRA_AGE",0)
            }
        }




//        val tname = findViewById<TextView>(R.id.UserDataName)
//        val btnreturn = findViewById<Button>(R.id.btntareaReturn)
//
////        intent.extras?.let {
////            if (it.containsKey("EXTRA_NAME_KEY")) {
////                val name = it.getString("EXTRA_NAME_KEY", "******************")
////                tname.text = name
////            }
////            if (it.containsKey("EXTRA_NAME_KEY")) {
////                val age = it.getInt("EXTRA_AGE", 0)
////            }
////        val name =
//
//         intent.extras?.let {extras->
//            if(extras.containsKey("EXTRA_NAME_KEY")){
//                val name = extras.getString("EXTRA_NAME_KEY","*554454")
//                //tname.text= name
//                 Toast.makeText(this,"Mi nombre es: $name",Toast.LENGTH_SHORT).show()
//            }

            btnreturn.setOnClickListener {
                val resultsIntent = Intent().apply {
                    putExtra("EXTRA_NAME_KEY", false)
                }

                setResult(RESULT_OK, resultsIntent)
                finish()
            }





//        putExtra("EXTRA_NAME_KEY",nameReg.text)
//        putExtra("EXTRA_SECOND_NAME_KEY",secondName.text)
//        putExtra("EXTRA_EMAIL_KEY",email.text)
//        putExtra("EXTRA_AGE_KEY", age.text)
//        putExtra("EXTRA_PHONE_KEY", phone.text)





    }
}