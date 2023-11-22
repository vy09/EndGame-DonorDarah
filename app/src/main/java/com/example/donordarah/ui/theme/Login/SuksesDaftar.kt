package com.example.donordarah.ui.theme.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.donordarah.R
import com.example.donordarah.ui.theme.Home.Home

class SuksesDaftar : AppCompatActivity(), View.OnClickListener {

    private lateinit var cancel : ImageView
    private lateinit var btnOK : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sukses_daftar)

        cancel = findViewById(R.id.imageView3)
        cancel.setOnClickListener(this)

        btnOK = findViewById(R.id.btn_ok)
        btnOK.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.imageView3 -> {
                val intent = Intent(this, SignUp::class.java)
                startActivity(intent)
            }

            R.id.btn_ok ->{
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }
        }
    }
}