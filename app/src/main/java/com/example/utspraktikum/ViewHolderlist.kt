package com.example.utspraktikum

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderlist (inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.recycle_view, parent, false)) {


    private var imgView: ImageView? = null
    private var txtTitle: TextView? = null
    private var txtSubtitle: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.img_view)
        txtTitle = itemView.findViewById(R.id.title1)
        txtSubtitle = itemView.findViewById(R.id.sub_title1)
    }
    fun bind(data: Data) {
        val imageResource = imgView?.setImageResource(data.imgView)
        txtTitle?.text = data.txtTitle
        txtSubtitle?.text = data.txtSubtitle


    }
}