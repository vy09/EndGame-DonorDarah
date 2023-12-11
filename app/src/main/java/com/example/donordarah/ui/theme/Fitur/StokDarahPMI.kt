package com.example.donordarah.ui.theme.Fitur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.donordarah.R
import com.example.donordarah.ui.theme.Home.Home

class StokDarahPMI : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnback236 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stok_darah_pmi)

        btnback236 = findViewById(R.id.btnback236)
        btnback236.setOnClickListener(this)

        val daerah : TextView = findViewById(R.id.judul)
        val bundle : Bundle? = intent.extras
        val daerahid = bundle?.getString("daerah")
        daerah.text = daerahid
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnback236 -> {
                val intent = Intent(this, MenuStokDarah::class.java)
                startActivity(intent)
            }
        }
    }
}