package com.example.ddcharactersheet.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ddcharactersheet.R
import com.example.ddcharactersheet.models.CharacterCardModel

class CharacterCardAdapter(private val dataSet: Array<CharacterCardModel>) : RecyclerView.Adapter<CharacterCardAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val nameView: TextView = view.findViewById(R.id.name)
        val infoView: TextView = view.findViewById(R.id.info)
        val hpView: TextView = view.findViewById(R.id.hp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.character_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = dataSet[position]
        holder.nameView.text = model.name
        holder.infoView.text = model.info
        holder.hpView.text = model.hp
    }

    override fun getItemCount() = dataSet.size
}