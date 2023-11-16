package com.example.donordarah.ui.theme.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.donordarah.R

class SignIn : AppCompatActivity(), View.OnClickListener {

    private lateinit var signin : Button
    private lateinit var lupapw: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        signin = findViewById(R.id.btn_masuk)
        signin.setOnClickListener(this)

        lupapw = findViewById(R.id.lupaPW)
        lupapw.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        TODO("Not yet implemented")
        when(v.id){
            R.id.btn_masuk->{
                val intent = Intent(this,signin::class.java)
                startActivity(intent)
            }

            R.id.lupaPW->{
                val intent = Intent(this, SuksesDaftar::class.java)
                startActivity(intent)
            }
        }
    }
}