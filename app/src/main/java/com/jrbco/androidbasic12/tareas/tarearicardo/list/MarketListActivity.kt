package com.jrbco.androidbasic12.tareas.tarearicardo.list

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jrbco.androidbasic12.R

class MarketListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_market_list)

        val list = findViewById<RecyclerView>(R.id.marketList)

        val data = listOf(MarketEntity("Mesa", "102","$1000", ""),
            MarketEntity("Laptop", "303","$3000", ""),
            MarketEntity("Litera", "402","$1500", ""),
            MarketEntity("Flanes", "101","$25", ""),
            MarketEntity("Audífonos", "101","$500", ""),
            MarketEntity("Sillas", "201","$600", ""),
            MarketEntity("Espejo", "204","$200", ""),
            MarketEntity("Maceta", "303","$100", ""),
            MarketEntity("Silla de ruedas", "102","$4500", ""),
            MarketEntity("Muletas", "102","$1000", ""),
            MarketEntity("Chamarra negra", "104","$1300", "")
        )

        val adapter = MarketAdapter(data)
        list.adapter = adapter
        // list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        list.layoutManager = GridLayoutManager(this, 2)


    }
}