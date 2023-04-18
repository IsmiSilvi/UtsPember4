package com.example.utspraktikum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: myAdapterlist

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        showList()
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<Data>()
        data.add(Data(R.drawable.angin,"Angin kencang","kuning"))
        data.add(Data(R.drawable.cancer,"Cancer","pink"))
        data.add(Data(R.drawable.cars,"Cars","hijau"))
        data.add(Data(R.drawable.fana,"Fana Merah Jambu","merah"))
        data.add(Data(R.drawable.kill,"Kill Biz","putih"))
        data.add(Data(R.drawable.impossible,"Impossible","merah"))
        data.add(Data(R.drawable.angin,"Angin ","kuning"))
        data.add(Data(R.drawable.cancer,"Cancer","pink"))
        data.add(Data(R.drawable.cars,"Cars","hijau"))
        data.add(Data(R.drawable.fana,"Fana Merah Jambu","merah"))
        data.add(Data(R.drawable.kill,"Kill Biz","putih"))
        data.add(Data(R.drawable.impossible,"Impossible","merah"))
        data.add(Data(R.drawable.fana,"Fana merah Jambu","kuning"))
        data.add(Data(R.drawable.cars,"Cars","pink"))
        data.add(Data(R.drawable.cancer,"Cancer","hijau"))
        data.add(Data(R.drawable.kill,"Kill Biz","merah"))
        data.add(Data(R.drawable.angin,"Angin Kencang","putih"))
        data.add(Data(R.drawable.impossible,"Impossible","merah"))
        data.add(Data(R.drawable.fana,"Fana merah Jambu","kuning"))
        data.add(Data(R.drawable.cars,"Cars","pink"))

        adapter = myAdapterlist(data)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.example_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item1 -> {
                showList()
                return true
            }
            R.id.item2 -> {
                showGrid()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun showList() {
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    private fun showGrid() {
        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }
}
