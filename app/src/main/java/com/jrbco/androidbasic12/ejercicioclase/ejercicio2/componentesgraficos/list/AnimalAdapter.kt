package com.jrbco.androidbasic12.ejercicioclase.ejercicio2.componentesgraficos.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.jrbco.androidbasic12.R
import com.squareup.picasso.Picasso

class AnimalAdapter(val list: List<AnimalEntity>): RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {


    var onItemSelected : ((AnimalEntity) -> Unit)? = null

    class AnimalViewHolder(view:View): RecyclerView.ViewHolder(view){

        val ivAnimal = view.findViewById<ImageView>(R.id.ivAnimal)
        val tvAnimal = view.findViewById<TextView>(R.id.tvAnimal)
        val tvColor = view.findViewById<TextView>(R.id.tvColor)
        val cardanimal = view.findViewById<CardView>(R.id.cardvAnimal)

        fun render(animalEntity: AnimalEntity,onItemSelected:((AnimalEntity) -> Unit)?) {

            tvAnimal.text = animalEntity.name
            tvColor.text = animalEntity.color

            tvColor.typeface = ResourcesCompat.getFont(tvColor.context,R.font.bernier_shade_regular)

            cardanimal.setOnClickListener {
                onItemSelected?.invoke(animalEntity)
            }
            Picasso.get()
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRM1-2B5wjpFuyYrSCslCd0do7Do5-wcCwnOQ&usqp=CAU")
                .placeholder(R.drawable.img_main_logo)
                .error(R.drawable.img_android)
                .into(ivAnimal)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_animal,parent,false)
        return AnimalViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.render(list[position],onItemSelected)

    }
}