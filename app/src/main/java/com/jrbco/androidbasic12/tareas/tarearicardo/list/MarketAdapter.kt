package com.jrbco.androidbasic12.tareas.tarearicardo.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jrbco.androidbasic12.R

class MarketAdapter(val list:List<MarketEntity>): RecyclerView.Adapter<MarketAdapter.MarketViewHolder>() {

    class MarketViewHolder(view: View): RecyclerView.ViewHolder(view){

        val ivProduct = view.findViewById<ImageView>(R.id.ivProduct)
        val tvProduct = view.findViewById<TextView>(R.id.tvProduct)
        val tvPrice = view.findViewById<TextView>(R.id.tvPrice)
        val tvDepto = view.findViewById<TextView>(R.id.tvDepto)

        fun render(marketEntity: MarketEntity){
            // ivProduct.text = marketEntity.image
            tvProduct.text = marketEntity.name
            tvPrice.text = marketEntity.price
            tvDepto.text = marketEntity.depto
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarketViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_market, parent, false)
        return MarketViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MarketViewHolder, position: Int) {
        holder.render(list[position])
    }



}