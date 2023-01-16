package com.example.bookshelf.data.response

@kotlinx.serialization.Serializable()
data class Book(
    val accessInfo: AccessInfo,
    val etag: String,
    val id: String,
    val kind: String,
    val saleInfo: SaleInfo,
    val searchInfo: SearchInfo,
    val selfLink: String,
    val volumeInfo: VolumeInfo
){
//    init{
//        Book.serializer()
//    }
}