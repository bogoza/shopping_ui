package com.example.shoppingui.data

import java.util.UUID
import java.util.UUID.randomUUID

data class ItemModel (
    val id: UUID = randomUUID(),
    var image:Int,
    var title: String,
    var price: String
)