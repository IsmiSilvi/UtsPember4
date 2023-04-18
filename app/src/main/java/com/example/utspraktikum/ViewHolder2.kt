package com.example.utspraktikum

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder2 (inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.recycle_view2, parent, false)) {

    private var imgView: ImageView? = null
    private var txtTitle: TextView? = null
    private var txtSubtitle: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.img_view2)
        txtTitle = itemView.findViewById(R.id.titlegrid)
        txtSubtitle = itemView.findViewById(R.id.sub_titlegrid)
    }

    fun bind(data: Data) {
        val imageResource = imgView?.setImageResource(data.imgView)
        txtTitle?.text = data.txtTitle
        txtSubtitle?.text = data.txtSubtitle


    }
}