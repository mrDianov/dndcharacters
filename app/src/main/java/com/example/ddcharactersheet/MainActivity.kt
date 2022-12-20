package com.example.ddcharactersheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.ddcharactersheet.adapters.CharacterCardAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardAdapter = CharacterCardAdapter(arrayOf())
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = cardAdapter
    }
}