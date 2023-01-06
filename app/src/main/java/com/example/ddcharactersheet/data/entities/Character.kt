package com.example.ddcharactersheet.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "character")
data class Character(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "class")
    val dndClass: String,
    @ColumnInfo(name = "race")
    val dndRace: String,
    @ColumnInfo(name = "max_hp")
    val maxHp: Int,
    @ColumnInfo(name = "hp")
    val hp: Int,
    @ColumnInfo(name = "xp")
    val xp: Int
)