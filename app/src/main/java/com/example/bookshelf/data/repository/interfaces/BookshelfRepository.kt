package com.example.bookshelf.data.repository.interfaces

import com.example.bookshelf.data.response.Book

interface BookshelfRepository {
    suspend fun fetchBooks(searchQuery:String):List<Book>
}