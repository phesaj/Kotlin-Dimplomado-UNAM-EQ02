package com.jrbco.androidbasic12.ejercicioclase.ejercicio1.explicitIntent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.registerForActivityResult
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R

class HomeActivity : AppCompatActivity() {

    private val register = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ result ->
        if(result.resultCode == RESULT_OK){
            val isCorrect = result.data?.getBooleanExtra("EXTRA_IS_CORRECT_KEY_01",false)
            if(isCorrect==true){
                onBackPressedDispatcher.onBackPressed()
            }else{
                Toast.makeText(this, "resultExtra= $isCorrect", Toast.LENGTH_SHORT).show()
            }
        }else{
            Toast.makeText(this, "CANCELED", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val btnSenActivity = findViewById<Button>(R.id.btnSendActivity)

        btnSenActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply {

//                val bundle = Bundle().apply {
//                    putExtra("EXTRA_AGE",40)
//                    putExtra("EXTRA_SURNAME","Rodriguez")
//                }
                putExtra("EXTRA_NAME_KEY_01","Joel Rodriguez")
                putExtra("EXTRA_AGE_01",39)
            }

           // startActivity(intent)
            register.launch(intent)

        }


    }
}