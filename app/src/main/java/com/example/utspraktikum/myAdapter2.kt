package com.example.utspraktikum

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class myAdapter2 (private val data: ArrayList<Data>): RecyclerView.Adapter<ViewHolderlist>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderlist {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolderlist(inflater,parent)
    }

    override fun onBindViewHolder(holder: ViewHolderlist, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}