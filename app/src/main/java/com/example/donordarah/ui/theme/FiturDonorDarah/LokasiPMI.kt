package com.example.donordarah.ui.theme.FiturDonorDarah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.donordarah.R

class LokasiPMI : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_cancel : ImageView
    private lateinit var img :ImageView
    private lateinit var  daerahh : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lokasi_pmi)

        btn_cancel = findViewById(R.id.btn_cancel)
        btn_cancel.setOnClickListener(this)

        val image : ImageView = findViewById(R.id.gambar)
        val daerah : TextView = findViewById(R.id.judul)

        val bundle : Bundle? = intent.extras
        val imageid = bundle?.getInt("image")
        val daerahid = bundle?.getString("daerah")

        daerah.text = daerahid
        if (imageid != null) {
            image.setImageResource(imageid)
        }
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_cancel ->{
                val intent = Intent (this, MenuDonorDarah::class.java)
                startActivity(intent)
            }
        }
    }
}