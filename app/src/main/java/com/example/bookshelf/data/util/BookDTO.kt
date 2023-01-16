package com.example.bookshelf.data.util

import com.example.bookshelf.data.response.Book
import com.google.gson.annotations.SerializedName

data class BooksDto(
    @SerializedName("items") val books: List<Book>?
)