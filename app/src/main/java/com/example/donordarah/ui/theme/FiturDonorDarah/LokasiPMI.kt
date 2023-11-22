package com.example.donordarah.ui.theme.FiturDonorDarah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.donordarah.R

class LokasiPMI : AppCompatActivity(), View.OnClickListener {
    private lateinit var cancel : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lokasi_pmi)

        cancel = findViewById(R.id.cancel)
        cancel.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.cancel->{
                val intent = Intent(this,MenuDonorDarah::class.java)
                startActivity(intent)
            }
        }
    }
}