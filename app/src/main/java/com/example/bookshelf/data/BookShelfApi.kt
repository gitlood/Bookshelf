package com.example.bookshelf.data

import com.google.gson.JsonArray
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BookShelfApi {
    @GET("volumes?")
    fun getBooksBySearchQuery(
        @Query("searchTerm") searchTerm: String
    ): Call<JsonArray>
}