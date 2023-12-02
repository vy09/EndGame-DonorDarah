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
import com.google.android.material.textfield.TextInputEditText


class SignIn : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn_signIn : Button
    private lateinit var lupa: TextView
    private lateinit var daftar:TextView

    private lateinit var email : TextInputEditText
    private lateinit var password : TextInputEditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        btn_signIn = findViewById(R.id.btn_signIn)
        btn_signIn.setOnClickListener(this)

        lupa = findViewById(R.id.lupaPW)
        lupa.setOnClickListener(this)

        daftar=findViewById(R.id.btn_daftar)
        daftar.setOnClickListener(this)

        email = findViewById(R.id.edit_email)
        password = findViewById(R.id.psswd)

        email.addTextChangedListener(loginTextWatcher)
        password.addTextChangedListener(loginTextWatcher)


    }

    private var loginTextWatcher = object :TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
           val user_email = email.text.toString().trim()
           val user_pass = password.text.toString().trim()

           btn_signIn.isEnabled = user_email.isNotEmpty() && user_pass.isNotEmpty()
        }

        override fun afterTextChanged(s: Editable?) {}
    }



    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_signIn ->{
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }

            R.id.lupaPW ->{
                val intent = Intent(this, gantisandi::class.java)
                startActivity(intent)
            }

            R.id.btn_daftar ->{
                val intent= Intent(this, SignUp::class.java)
                startActivity(intent)
            }
        }
    }
}