package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.componentesgraficos.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jrbco.androidbasic12.R

class PersonAdapter(val list: List<PersonEntity>): RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(view: View): RecyclerView.ViewHolder(view){

        val tvName = view.findViewById<TextView>(R.id.tvName)
        val tvSurname = view.findViewById<TextView>(R.id.tvSurname)
        val tvAddress = view.findViewById<TextView>(R.id.tvAddress)
        val tvPhone = view.findViewById<TextView>(R.id.tvPhone)

        fun render(datos: PersonEntity) {
            tvName.text = datos.name
            tvSurname.text = datos.surname
            tvAddress.text = datos.address
            tvPhone.text = datos.phone.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_person,parent,false)
        return PersonViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.render(list[position])
    }

}