package com.example.bookshelf.data.response

@kotlinx.serialization.Serializable
data class SaleInfo(
    val country: String,
    val isEbook: Boolean,
    val saleability: String
)