package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.fragment.params

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.jrbco.androidbasic12.R
import com.jrbco.androidbasic12.databinding.FragmentSendParamsBinding
import com.jrbco.androidbasic12.ejercicioclase.ejercicio1.explicitIntent.HomeActivity


class SendParamsFragment : Fragment() {

    private lateinit var binding:FragmentSendParamsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSendParamsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setHasOptionsMenu(true)
        (activity as AppCompatActivity)
            .supportActionBar?.setDisplayHomeAsUpEnabled(false)

        binding.btnSendParams.setOnClickListener {

            val name = binding.etName.text.toString()
            val age = binding.etAge.text.toString()

            if (name.isNotEmpty()){
                parentFragmentManager.beginTransaction()
                    .replace(R.id.FragmentParams,ReceiveParamsFragment.newInstance(name, age.toInt()))
                    .addToBackStack("ReceiveParamsFragment")
                    .commit()
            }

            /*
            val intent = Intent(requireActivity(),HomeActivity::class.java)
            val intent = Intent(requireContext(),HomeActivity::class.java)
            startActivity(intent)
            */
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = SendParamsFragment()
    }
}