package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.fragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jrbco.androidbasic12.R
import com.jrbco.androidbasic12.databinding.ActivityFragmentBinding
import java.util.zip.Inflater

class FragmentActivity : AppCompatActivity() {

    private lateinit var binding : ActivityFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFragmentBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment, FirstViewbindingFragment.newInstance())
            .addToBackStack("FirstViewbindingFragment")
            .commit()

        /*supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, FirstViewbindingFragment.newInstance())
            .commit()*/

    }
}