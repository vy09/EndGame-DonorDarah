package com.example.donordarah.ui.theme.Profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.donordarah.R

class HistoryMainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn111 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_main)

        btn111 = findViewById(R.id.btn111)
        btn111.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
        R.id.btn111 ->{
            val intent = Intent(this, MenuProfile::class.java)
            startActivity(intent)
        }
    }
    }
}