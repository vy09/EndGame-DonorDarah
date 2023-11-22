package com.example.donordarah.ui.theme.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.donordarah.R
import com.example.donordarah.ui.theme.ui.login.LoginActivity

class gantisandi : AppCompatActivity(), View.OnClickListener {
    private lateinit var kirim: Button
    private lateinit var back : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gantisandi)

        kirim = findViewById(R.id.buttonkirim)
        kirim.setOnClickListener(this)

        back = findViewById(R.id.backbtn)
        back.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonkirim -> {
                val intent = Intent(this, VerifikasiEmail::class.java)
                startActivity(intent)
            }
            R.id.backbtn ->{
                val intent = Intent(this, SignUp::class.java)
                startActivity(intent)
            }
        }
    }
}


