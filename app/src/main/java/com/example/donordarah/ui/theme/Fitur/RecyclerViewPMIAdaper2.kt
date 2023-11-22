package com.example.donordarah.ui.theme.Fitur

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.donordarah.R
import kotlin.coroutines.coroutineContext

class RecyclerViewPMIAdaper2(private val context: Context, private val pmi2: List<PMI2>, val listener: (PMI2) -> Unit)
    : RecyclerView.Adapter<RecyclerViewPMIAdaper2.PMI2ViewHolder>(){
    class PMI2ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgPmi = view.findViewById<ImageView>(R.id.img_item_photo)
        val namePmi = view.findViewById<TextView>(R.id.tv_item_name)
        val almtPmi = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(pmi2: PMI2, listener: (PMI2) -> Unit){
            imgPmi.setImageResource(pmi2.imgPmi)
            namePmi.text = pmi2.namePmi
            almtPmi.text = pmi2.almtPmi
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PMI2ViewHolder {
        return PMI2ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.pmi_jabodetabek_list2, parent, false)
        )
    }


    override fun onBindViewHolder(holder: PMI2ViewHolder, position: Int) {
       holder.bindView(pmi2[position], listener)
    }


    override fun getItemCount(): Int = pmi2.size
    }