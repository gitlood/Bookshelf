package com.example.bookshelf.data.repository.interfaces

import com.example.bookshelf.data.util.ItemsResponse
import retrofit2.Call

interface BookshelfRepository {
    suspend fun fetchBooks(searchQuery:String): Call<ItemsResponse>
}