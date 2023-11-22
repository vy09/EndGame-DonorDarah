package com.example.donordarah.ui.theme.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.donordarah.R
import com.example.donordarah.ui.theme.ui.login.LoginActivity

class VerifikasiEmail : AppCompatActivity(), View.OnClickListener {
    private lateinit var verif: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifikasi_email)

        verif = findViewById(R.id.buttonvervi)
        verif.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonvervi -> {
                val intent = Intent(this, sandiBaru::class.java)
                startActivity(intent)
            }
        }
    }
}