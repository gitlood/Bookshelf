package com.example.bookshelf.data.repository

import com.example.bookshelf.data.BookShelfApi
import com.example.bookshelf.data.repository.interfaces.BookshelfRepository
import com.example.bookshelf.data.util.ItemsResponse
import retrofit2.Call

class BookshelfRepositoryImpl(private val bookShelfApi: BookShelfApi) : BookshelfRepository {

    override suspend fun fetchBooks(searchQuery: String): Call<ItemsResponse> {
        return bookShelfApi.getBooksBySearchQuery(searchQuery)
    }
}