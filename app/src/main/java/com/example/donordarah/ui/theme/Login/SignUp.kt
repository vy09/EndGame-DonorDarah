package com.example.donordarah.ui.theme.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.donordarah.R

class SignUp : AppCompatActivity(), View.OnClickListener {

    private lateinit var signup: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

//        signup = findViewById(R.id.btn_daftar)
//        signup.setOnClickListener(this)
    }

    override fun onClick(v: View) {

//        when (v.id) {
//            R.id.btn_daftar -> {
//                val intent = Intent(this, signup::class.java)
//                startActivity(intent)
//            }
//        }

    }
}
