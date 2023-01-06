package com.example.ddcharactersheet.data.dao

import androidx.room.*
import com.example.ddcharactersheet.data.entities.Character

@Dao
interface CharacterDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Character)

    @Update
    suspend fun update(item: Character)

    @Delete
    suspend fun delete(item: Character)
}