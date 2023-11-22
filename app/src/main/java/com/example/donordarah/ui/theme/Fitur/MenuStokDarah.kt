package com.example.donordarah.ui.theme.Fitur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.donordarah.R

class MenuStokDarah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_stok_darah)

        val pmi2List = listOf<PMI2>(
            PMI2(
                R.drawable.img_16,
                "PMI Kota Depok",
                "Jl. Boulevard Grand Depok City"
            ),
            PMI2(
                R.drawable.img_16,
                "PMI Jakarta Selatan",
                "Jl. xxxxxxx"
            ),
            PMI2(
                R.drawable.img_16,
                "PMI Kota Bekasi",
                "Jl. xxxxxxx"

            ),
            PMI2(
                R.drawable.img_16,
                "PMI Kota Tangerang Selatan",
                "Jl. xxxxxxx"

            ),
            PMI2(
                R.drawable.img_16,
                "PMI Kota Bogor",
                "Jl. xxxxxxx"

            ),
            PMI2(
                R.drawable.img_16,
                "PMI Jakarta Timur",
                "Jl. xxxxxxx"

            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rvPMIJabodetabek2)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = RecyclerViewPMIAdaper2(this, pmi2List){

        }
    }
}