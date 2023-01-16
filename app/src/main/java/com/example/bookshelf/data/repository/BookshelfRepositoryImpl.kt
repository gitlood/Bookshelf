package com.example.bookshelf.data.repository

import com.example.bookshelf.data.BookShelfApi
import com.example.bookshelf.data.repository.interfaces.BookshelfRepository
import com.example.bookshelf.data.response.Book

class BookshelfRepositoryImpl(private val bookShelfApi: BookShelfApi) : BookshelfRepository {

    override suspend fun fetchBooks(searchQuery: String): List<Book> {
        return bookShelfApi.getBooksBySearchQuery(searchQuery).execute().body()?.itemList
            ?: emptyList()
    }
}