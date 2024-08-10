package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.fragment.params

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.jrbco.androidbasic12.R
import com.jrbco.androidbasic12.databinding.FragmentReceiveParamsBinding


class ReceiveParamsFragment : Fragment() {

    private lateinit var binding: FragmentReceiveParamsBinding
    private var name: String? = ""
    private var age: Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            name = it.getString("ARG_NAME","nombre vacio")
            age = it.getInt("ARG_AGE",0)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentReceiveParamsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setHasOptionsMenu(true)
        (activity as AppCompatActivity)
            .supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.tvInfo.text = "Tu $name tienes $age años"
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            android.R.id.home  ->{
                requireActivity().onBackPressedDispatcher.onBackPressed()
                //activity?.onBackPressedDispatcher?.onBackPressed()
            }
        }

        return super.onOptionsItemSelected(item)
    }

    companion object {


        @JvmStatic
        fun newInstance(name:String, age:Int) =
            ReceiveParamsFragment().apply {
                arguments = Bundle().apply {
                    putString("ARG_NAME",name)
                    putInt("ARG_AGE",age)
                }
            }
    }
}