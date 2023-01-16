package com.example.bookshelf.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface BookShelfApi {
    @GET("volumes")
    suspend fun searchBooks(
        @Query("q") query: String = "cicero"
    ): Response<BooksDto>
}