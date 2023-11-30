package com.example.donordarah.ui.theme.Profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.donordarah.R
import com.example.donordarah.ui.theme.Home.Home

class EditProfile : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnback1: ImageView
    private lateinit var button4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        btnback1 = findViewById(R.id.btnback1)
        btnback1.setOnClickListener(this)

        button4 = findViewById(R.id.button4)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnback1 -> {
                val intent = Intent(this, MenuProfile::class.java)
                startActivity(intent)
            }
            R.id.button4 ->{
                val intent = Intent(this, MenuProfile::class.java)
                startActivity(intent)
            }
        }
    }
}
