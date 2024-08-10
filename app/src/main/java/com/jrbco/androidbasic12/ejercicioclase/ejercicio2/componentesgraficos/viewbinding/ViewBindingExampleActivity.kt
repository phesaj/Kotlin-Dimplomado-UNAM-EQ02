package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.componentesgraficos.viewbinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R
import com.jrbco.androidbasic12.databinding.ActivityViewBindingExampleBinding

class ViewBindingExampleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewBindingExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewBindingExampleBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.tvName.text = "Juan"
        binding.tvSurname.text = "Jose"
        binding.tvLastName.text = "Gonzalez"

    }
}