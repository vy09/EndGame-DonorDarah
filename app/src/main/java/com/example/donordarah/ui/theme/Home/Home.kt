package com.example.donordarah.ui.theme.Home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import com.example.donordarah.R
import com.example.donordarah.ui.theme.Fitur.MenuStokDarah
import com.example.donordarah.ui.theme.FiturDonorDarah.MenuDonorDarah
import com.example.donordarah.ui.theme.Profile.MenuProfile

class Home : AppCompatActivity(), View.OnClickListener {
    private lateinit var donor_darah :FrameLayout
    private lateinit var stok_darah : FrameLayout
    private lateinit var pengaturan : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        donor_darah = findViewById(R.id.donor_darah)
        donor_darah.setOnClickListener(this)

        stok_darah = findViewById(R.id.stok_darah)
        stok_darah.setOnClickListener(this)

        pengaturan =findViewById(R.id.pengaturan)
        pengaturan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.donor_darah ->{
                val intent = Intent(this, MenuDonorDarah::class.java)
                startActivity(intent)
            }
            R.id.stok_darah ->{
                val intent = Intent(this, MenuStokDarah::class.java)
                startActivity(intent)
            }
            R.id.pengaturan ->{
                val intent = Intent(this, MenuProfile::class.java)
                startActivity(intent)
            }
        }
    }
}