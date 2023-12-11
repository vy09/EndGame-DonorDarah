package com.example.donordarah.ui.theme.FiturDonorDarah

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.donordarah.R

class RecyclerViewPMIAdapter constructor(
    private val getMenuDonorDarah: MenuDonorDarah,
    private val pmiList : List<PMI>) :
    RecyclerView.Adapter<RecyclerViewPMIAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.pmi_jabodetabek_list, parent, false)
        return MyViewHolder(view)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvAlamat.text = pmiList[position].daerah
        holder.ivPmi.setImageResource(pmiList[position].image)

        holder.cardView.setOnClickListener {
            val context = holder.itemView.context
            val intent= Intent(context,LokasiPMI::class.java).apply {
                putExtra("Image",pmiList[position].image)
                putExtra("daerah",pmiList[position].daerah)

            }
            context.startActivity(intent)
            Toast.makeText(getMenuDonorDarah, pmiList[position].daerah, Toast.LENGTH_LONG).show()
        }
    }
    override fun getItemCount(): Int {
        return pmiList.size
    }
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val tvAlamat : TextView = itemView.findViewById(R.id.tvAlamat)
        val ivPmi : ImageView = itemView.findViewById(R.id.btnDetail)
        val cardView : CardView = itemView.findViewById(R.id.cardView)
    }
}