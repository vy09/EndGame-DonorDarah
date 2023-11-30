package com.example.donordarah.ui.theme.Profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import com.example.donordarah.R
import com.example.donordarah.ui.theme.Home.Home
import com.example.donordarah.ui.theme.Login.SignUp
import com.example.donordarah.ui.theme.Login.gantisandi

class MenuProfile : AppCompatActivity(), OnClickListener {
    private lateinit var btnEdtProfil: Button
    private lateinit var History: Button
    private lateinit var btnSyarat : Button
    private lateinit var btnTentang : Button
    private lateinit var btnback : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_profile)

        btnEdtProfil = findViewById(R.id.btnEdtProfil)
        btnEdtProfil.setOnClickListener(this)

        History = findViewById(R.id.History)
        History.setOnClickListener(this)

        btnSyarat = findViewById(R.id.btnSyarat)
        btnSyarat.setOnClickListener(this)

        btnTentang = findViewById(R.id.btnTentang)
        btnTentang.setOnClickListener(this)

        btnback = findViewById(R.id.btnback)
        btnback.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnback ->{
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }
            R.id.btnEdtProfil ->{
                val intent = Intent(this, EditProfile::class.java)
                startActivity(intent)
            }

            R.id.History ->{
                val intent = Intent(this, HistoryMainActivity::class.java)
                startActivity(intent)
            }

            R.id.btnSyarat ->{
                val intent = Intent(this,SyaratKetentuan::class.java)
                startActivity(intent)
            }

             R.id.btnTentang ->{
                 val intent = Intent(this, Tentang::class.java)
                 startActivity(intent)
             }
    }
    }
}
