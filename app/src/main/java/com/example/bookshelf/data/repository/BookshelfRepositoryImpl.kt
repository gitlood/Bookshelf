package com.example.bookshelf.data.repository

import com.example.bookshelf.data.BookShelfApi
import com.example.bookshelf.data.repository.interfaces.BookshelfRepository
import com.example.bookshelf.data.response.Book
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import timber.log.Timber

class BookshelfRepositoryImpl(private val bookShelfApi: BookShelfApi, private val dispatcher :CoroutineDispatcher) : BookshelfRepository {

    override suspend fun fetchBooks(searchQuery: String): List<Book>? = withContext(dispatcher) {
        try{val response = bookShelfApi.searchBooks(searchQuery)
        if(response.isSuccessful){
            response.body()?.books
        }else{
            Timber.tag("Repo").d("Response not successful")
            null
        }
        }catch (e:Exception){
            Timber.tag("Repo").d(e)
            null
        }
    }
}
