package com.example.donordarah.ui.theme.Login

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.donordarah.R
import com.example.donordarah.ui.theme.Home.Home

class SignUp : AppCompatActivity(), View.OnClickListener {

    private lateinit var signup: Button
    private lateinit var popup : Dialog
    private lateinit var back :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        signup = findViewById(R.id.btn_daftar)
        signup.setOnClickListener(this)
//        popup = Dialog(this)

        back = findViewById(R.id.btnback)
        back.setOnClickListener(this)
    }

    override fun onClick(v: View) {
//            popup.setContentView(R.layout.activity_sukses_daftar)
//            popup.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        when(v.id){
            R.id.btnback->{
                val intent = Intent(this,SignIn::class.java)
                startActivity(intent)
            }
            R.id.btn_daftar -> {
                val intent = Intent(this, SuksesDaftar::class.java)
                startActivity(intent)
            }
        }
            }
        }


//        when (v.id) {
//            R.id.btn_daftar -> {
//                val intent = Intent(this, SuksesDaftar::class.java)
//                startActivity(intent)
//            }
//        }popup.setContentView(R.layout.activity_sukses_daftar)
//                popup.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))



