package com.example.donordarah.ui.theme.Profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.donordarah.R

class Tentang : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnback321 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang)

        btnback321 = findViewById(R.id.btnback321)
        btnback321.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnback321 ->{
                val intent = Intent (this, MenuProfile::class.java)
                startActivity(intent)
            }
        }
    }
}