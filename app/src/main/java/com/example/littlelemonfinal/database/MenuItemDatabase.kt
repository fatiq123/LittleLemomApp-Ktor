package com.example.littlelemonfinal.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MenuItem::class], version = 1, exportSchema = false)
abstract class MenuItemDatabase : RoomDatabase(){

    abstract fun menuItemDao(): MenuItemDao
}