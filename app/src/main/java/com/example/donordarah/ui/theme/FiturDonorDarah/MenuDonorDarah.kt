package com.example.donordarah.ui.theme.FiturDonorDarah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.donordarah.R
import com.example.donordarah.ui.theme.Home.Home

class MenuDonorDarah : AppCompatActivity(), View.OnClickListener {

    private var recyclerView : RecyclerView? = null
    private var recyclerViewPMIAdapter : RecyclerViewPMIAdapter? = null
    private var pmiList = mutableListOf<PMI>()
    private lateinit var btn_Back5423 : ImageView
    private lateinit var detail :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_donor_darah)

        btn_Back5423 = findViewById(R.id.btn_Back5423)
        btn_Back5423.setOnClickListener(this)

        detail = findViewById(R.id.rvPMIjabodetabek)
        detail.setOnClickListener(this)

        pmiList = ArrayList()

        recyclerView = findViewById<View>(R.id.rvPMIjabodetabek) as RecyclerView
        recyclerViewPMIAdapter = RecyclerViewPMIAdapter(this@MenuDonorDarah, pmiList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewPMIAdapter

        preparePMIlistData()
    }

    private fun preparePMIlistData() {
        var pmi = PMI ("img_27", R.drawable.img_27)
        pmiList.add(pmi)
        pmi = PMI ("img_27", R.drawable.img_27)
        pmiList.add(pmi)
        pmi = PMI ("img_27", R.drawable.img_27)
        pmiList.add(pmi)
        pmi = PMI ("img_27", R.drawable.img_27)
        pmiList.add(pmi)
        pmi = PMI ("img_27", R.drawable.img_27)
        pmiList.add(pmi)
        pmi = PMI ("img_27", R.drawable.img_27)
        pmiList.add(pmi)
        pmi = PMI ("img_27", R.drawable.img_27)
        pmiList.add(pmi)
        pmi = PMI ("img_27", R.drawable.img_27)
        pmiList.add(pmi)
        pmi = PMI ("img_27", R.drawable.img_27)
        pmiList.add(pmi)
        pmi = PMI ("img_27", R.drawable.img_27)
        pmiList.add(pmi)

        recyclerViewPMIAdapter!!.notifyDataSetChanged()
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_Back5423 ->{
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }
            R.id.rvPMIjabodetabek->{
                val intent = Intent(this, LokasiPMI::class.java)
                startActivity(intent)
            }

        }

    }

}