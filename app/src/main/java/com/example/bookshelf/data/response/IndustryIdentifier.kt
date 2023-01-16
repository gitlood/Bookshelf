package com.example.bookshelf.data.response

@kotlinx.serialization.Serializable

data class IndustryIdentifier(
    val identifier: String,
    val type: String
)