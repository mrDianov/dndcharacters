package com.example.ddcharactersheet.view.activities

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.ddcharactersheet.R

class CharacterDetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.d("MYTAG", "its..")
        setContentView(R.layout.activity_detail)
        Log.d("MYTAG", "its ok")
    }
}