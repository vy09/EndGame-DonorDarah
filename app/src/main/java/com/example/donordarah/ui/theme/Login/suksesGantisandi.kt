package com.example.donordarah.ui.theme.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.donordarah.R
import com.example.donordarah.ui.theme.Home.Home

class suksesGantisandi : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnOk : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sukses_gantisandi)

        btnOk = findViewById(R.id.btn_ok2)
        btnOk.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, Home::class.java)
        startActivity(intent)

    }
}