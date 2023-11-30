package com.example.donordarah.ui.theme.Profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.donordarah.R
import com.example.donordarah.ui.theme.Home.Home

class SyaratKetentuan : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnback12 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_syarat_ketentuan)

        btnback12 = findViewById(R.id.btnback12)
        btnback12.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnback12 ->{
                val intent = Intent(this,MenuProfile::class.java)
                startActivity(intent)
        }
        }
    }
}