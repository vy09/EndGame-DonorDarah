package com.example.donordarah.ui.theme.Login


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.donordarah.R
import com.example.donordarah.ui.theme.Home.Home
import com.example.donordarah.databinding.ActivitySignInBinding

class SignIn : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn_signIn: Button
    private lateinit var binding: ActivitySignInBinding
    private lateinit var lupa: TextView
    private lateinit var pref: customSharePreference
    private lateinit var daftar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btn_signIn = findViewById(R.id.btn_signIn)
        btn_signIn.setOnClickListener(this)

        lupa = findViewById(R.id.lupaPW)
        lupa.setOnClickListener(this)

        daftar = findViewById(R.id.btn_daftar)
        daftar.setOnClickListener(this)

        binding.LoginGoogle.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {

            R.id.btn_signIn -> {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }
            R.id.lupaPW -> {
                val intent = Intent(this, gantisandi::class.java)
                startActivity(intent)
            }

            R.id.btn_daftar -> {
                val intent = Intent(this, SignUp::class.java)
                startActivity(intent)
            }
        }
    }
}