package com.example.ddcharactersheet.view.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ddcharactersheet.R
import com.example.ddcharactersheet.data.models.CharacterCardModel
import com.example.ddcharactersheet.view.adapters.CharacterCardAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MYTAG", "its ok")

        val cardAdapter = CharacterCardAdapter(arrayOf(
            CharacterCardModel("test", "test", "test"),
        ))
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = cardAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        val plusButton: FloatingActionButton = findViewById(R.id.plusButton)
        plusButton.setOnClickListener {
            val intent = Intent(this, CharacterDetailActivity()::class.java)
            startActivity(intent)
        }
    }
}