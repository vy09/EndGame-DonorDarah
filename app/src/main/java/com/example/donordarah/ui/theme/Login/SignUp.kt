package com.example.donordarah.ui.theme.Login

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.donordarah.R
import com.example.donordarah.ui.theme.Home.Home
import com.google.android.material.textfield.TextInputEditText

class SignUp : AppCompatActivity(), View.OnClickListener {

    private lateinit var signup: Button
    private lateinit var back :ImageView

    private lateinit var namapengguna : TextInputEditText
    private lateinit var notelp : TextInputEditText
    private lateinit var email : TextInputEditText
    private lateinit var alamat : TextInputEditText
    private lateinit var pass : TextInputEditText
    private lateinit var password : TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        signup = findViewById(R.id.btn_daftar)
        signup.setOnClickListener(this)

        back = findViewById(R.id.btnback)
        back.setOnClickListener(this)

        namapengguna.addTextChangedListener(loginTextWatcher)
        notelp.addTextChangedListener(loginTextWatcher)
        email.addTextChangedListener(loginTextWatcher)
        alamat.addTextChangedListener(loginTextWatcher)
        pass.addTextChangedListener(loginTextWatcher)
        password.addTextChangedListener(loginTextWatcher)
    }
    private var loginTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            val user_email = email.text.toString().trim()
            val user_nampeg = namapengguna.text.toString().trim()
            val user_notelp = notelp.text.toString().trim()
            val user_alamat = alamat.text.toString().trim()
            val user_pass = pass.text.toString().trim()
            val user_passw = password.text.toString().trim()

            signup.isEnabled = user_email.isNotEmpty() && user_pass.isNotEmpty() && user_nampeg.isNotEmpty() &&
                    user_notelp.isNotEmpty() && user_alamat.isNotEmpty() && user_passw.isNotEmpty()
        }

        override fun afterTextChanged(s: Editable?) {}
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



