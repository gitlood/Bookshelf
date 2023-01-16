package com.example.bookshelf.data.util

import com.example.bookshelf.data.response.Book
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ItemsResponse {
    @SerializedName("items")
    @Expose
    private val itemsList: List<Book>? = null
    val itemList = itemsList
}