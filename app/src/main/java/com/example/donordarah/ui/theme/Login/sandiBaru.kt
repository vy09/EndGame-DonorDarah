package com.example.donordarah.ui.theme.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.donordarah.R
import com.example.donordarah.ui.theme.Home.Home

class sandiBaru : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnkirim : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sandi_baru)

        btnkirim = findViewById(R.id.kirim)
        btnkirim.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.kirim ->{
                val intent =Intent(this, Home::class.java)
                startActivity(intent)
            }
        }
    }

}