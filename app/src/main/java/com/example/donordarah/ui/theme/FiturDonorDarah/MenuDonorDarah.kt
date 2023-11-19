package com.example.donordarah.ui.theme.FiturDonorDarah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.donordarah.R

class MenuDonorDarah : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var recyclerViewPMIAdapter : RecyclerViewPMIAdapter? = null
    private var pmiList = mutableListOf<PMI>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_donor_darah)

        pmiList = ArrayList()

        recyclerView = findViewById<View>(R.id.rvPMIJabodetabek) as RecyclerView
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
}