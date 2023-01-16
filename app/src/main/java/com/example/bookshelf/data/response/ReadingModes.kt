package com.example.bookshelf.data.response

@kotlinx.serialization.Serializable

data class ReadingModes(
    val image: Boolean,
    val text: Boolean
)