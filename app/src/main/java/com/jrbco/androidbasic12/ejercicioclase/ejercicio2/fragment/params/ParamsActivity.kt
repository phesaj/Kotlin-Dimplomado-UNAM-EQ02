package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.fragment.params

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBar.LayoutParams
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R
import com.jrbco.androidbasic12.databinding.ActivityParamsBinding
import com.jrbco.androidbasic12.databinding.FragmentSecondBinding

class ParamsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityParamsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParamsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.FragmentParams,SendParamsFragment.newInstance())
            .commit()
    }
}