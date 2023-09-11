package com.example.littlelemonfinal.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MenuItem(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val title: String,
    val price: Double,
)
