package com.denis.portalberita

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PortalBeritaAdapter(val dataBerita: List<DataItem?>?) : RecyclerView.Adapter<PortalBeritaAdapter.MyViewHolder>() {
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val judul = view.findViewById<TextView>(R.id.judulberita)
        val isi = view.findViewById<TextView>(R.id.isiberita)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_page,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        if(dataBerita != null){
            return dataBerita.size
        }
        return 0
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.judul.text = dataBerita?.get(position)?.judul
        holder.isi.text = dataBerita?.get(position)?.isi

        holder.itemView.setOnClickListener{
            val nama = dataBerita?.get(position)?.username
            Toast.makeText(holder.itemView.context, "${nama}",Toast.LENGTH_SHORT).show()
        }
    }
}