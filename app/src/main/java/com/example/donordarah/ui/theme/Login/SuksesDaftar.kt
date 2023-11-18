package com.example.donordarah.ui.theme.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.donordarah.R

class SuksesDaftar : AppCompatActivity(), View.OnClickListener {

    private lateinit var cancel : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sukses_daftar)

        cancel = findViewById(R.id.imageView3)
        cancel.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        TODO("Not yet implemented")
        when (v.id) {
            R.id.imageView3 -> {
                val intent = Intent(this, SignUp::class.java)
                startActivity(intent)
            }
        }
    }
}