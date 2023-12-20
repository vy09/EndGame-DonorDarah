package com.example.donordarah.ui.theme.Fitur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.donordarah.R
import com.example.donordarah.ui.theme.Home.Home

class MenuStokDarah : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn_Back5424 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_stok_darah)

        btn_Back5424 = findViewById(R.id.btn_Back5424)
        btn_Back5424.setOnClickListener(this)

        val pmi2List = listOf<PMI2>(
            PMI2(
                R.drawable.img_34,
                "PMI Kota Depok",
                "Jl. Boulevard Grand Depok City"
            ),
            PMI2(
                R.drawable.img_39,
                "PMI Tangerang Selatan",
                "Jl. Cendekia Sektor 11, Ciater"
            ),
            PMI2(
                R.drawable.img_42,
                "PMI Kota Tangerang",
                "Jl. Mayjen Sutoyo No.15"

            ),
            PMI2(
                R.drawable.img_40,
                "PMI Jakarta Utara",
                "Jl. Plumpang Semper No.54, RT.1/RW.4"

            ),
            PMI2(
                R.drawable.img_36,
                "PMI Kota Bogor",
                "Jl. Kresna Raya No.43a, Bantarjati"

            ),
            PMI2(
                R.drawable.img_33,
                "PMI Jakarta Timur",
                "Jl. I Gusti Ngurah Rai No.77,"
            ),
            PMI2(
                R.drawable.img_41,
                "PMI Jakarta Barat",
                "Jl. Perdana No.12, RT.1/RW.1, Wijaya Kusuma"
            ),
            PMI2(
                R.drawable.img_35,
                "PMI Jakarta Pusat",
                "Jl. Pecenongan No.82, RT.2/RW.4"
            ),
            PMI2(
                R.drawable.img_37,
                "PMI Jakarta Selatan",
                "Jl. Condet Pejaten No.9A 1, RT.1/RW.7"

            ),
            PMI2(
                R.drawable.img_38,
                "PMI Kota Bekasi",
                "Jl. Pramuka No.1, RT.006/RW.006, Marga Jaya"

            ),
            PMI2(
                R.drawable.img_35,
                "PMI Bogor",
                "Jl. Pramuka No.1, RT.006/RW.006, Marga Jaya"

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
            R.id.btn_Back5424 ->{
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }

        }

    }

}