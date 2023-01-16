package com.example.bookshelf.data.response
@kotlinx.serialization.Serializable

data class ImageLinks(
    val smallThumbnail: String,
    val thumbnail: String
)