package com.example.littlelemonfinal.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MenuItemDao {

    @Query("SELECT * FROM MenuItem")
    fun getAll(): LiveData<List<MenuItem>>

    @Insert
    fun insertAll(vararg menuItem: MenuItem)

    @Query("SELECT (SELECT COUNT(*) FROM MenuItem) == 0")
    fun isEmpty(): Boolean

}