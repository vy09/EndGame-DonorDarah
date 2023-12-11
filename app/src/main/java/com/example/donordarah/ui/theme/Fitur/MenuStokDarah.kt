package com.example.donordarah.ui.theme.Fitur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.donordarah.R
import com.example.donordarah.ui.theme.Home.Home

class MenuStokDarah : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn_Back5424 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_stok_darah)

        btn_Back5424 = findViewById(R.id.btnback5)
        btn_Back5424.setOnClickListener(this)

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
                "PMI Tangerang Selatan",
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

            ),
            PMI2(
                R.drawable.img_16,
                "PMI Jakarta Barat",
                "Jl. xxxxxxx"
            ),
            PMI2(
                R.drawable.img_16,
                "PMI DKI Jakarta",
                "Jl. xxxxxxx"
            ),
            PMI2(
                R.drawable.img_16,
                "PMI Jakarta Utara",
                "Jl. xxxxxxx"

            ),
            PMI2(
                R.drawable.img_16,
                "PMI Kota Tangerang",
                "Jl. xxxxxxx"

            ),
            PMI2(
                R.drawable.img_16,
                "PMI Kabupaten Tangerang",
                "Jl. xxxxxxx"

            ),
            PMI2(
                R.drawable.img_16,
                "PMI Kecamatan Kemang",
                "Jl. xxxxxxx"

            )
        )


        val recyclerView = findViewById<RecyclerView>(R.id.rvPMIJabodetabek2)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = RecyclerViewPMIAdaper2(this, pmi2List){

        }
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnback5 ->{
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }

        }

    }

}