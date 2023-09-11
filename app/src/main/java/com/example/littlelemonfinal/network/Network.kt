package com.example.littlelemonfinal.network

import com.example.littlelemonfinal.database.MenuItem
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MenuNetwork(
    @SerialName("menu")
    val menu: List<MenuItemNetwork>,
)

@Serializable
data class MenuItemNetwork(
    @SerialName("id")
    val id: Int,
    @SerialName("title")
    val title: String,
    @SerialName("price")
    val price: Double,
) {
    fun toMenuItem() = MenuItem(
        id,
        title,
        price,
    )
    /*The toMenuItem function should use all of the properties of the MenuNetwork class and return an
    instance of the MenuItem class that can be saved to the database.*/
}