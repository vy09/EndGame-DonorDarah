package com.example.donordarah.ui.theme.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.donordarah.R
import com.example.donordarah.ui.theme.ui.login.LoginActivity

class Pembukaan2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var lewat: TextView
    private lateinit var lanjut: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembukaan2)

        lewat=findViewById(R.id.lewati)
        lewat.setOnClickListener(this)

        lanjut=findViewById(R.id.selanjutnya)
        lanjut.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.lewati->{
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }

            R.id.selanjutnya->{
                val intent = Intent(this, SignIn::class.java)
                startActivity(intent)
            }
        }
    }
}
