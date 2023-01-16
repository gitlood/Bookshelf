package com.example.bookshelf.di

import com.example.bookshelf.data.BookShelfApi
import com.example.bookshelf.data.repository.BookshelfRepositoryImpl
import com.example.bookshelf.data.repository.interfaces.BookshelfRepository
import com.example.bookshelf.data.util.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): BookShelfApi =
        retrofit.create(BookShelfApi::class.java)

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    @Singleton
    @Provides
    fun provideRepository(api: BookShelfApi): BookshelfRepository =
        BookshelfRepositoryImpl(api)
}
