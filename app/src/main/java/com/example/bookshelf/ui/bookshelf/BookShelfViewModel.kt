package com.example.bookshelf.ui.bookshelf

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookshelf.data.repository.interfaces.BookshelfRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BookShelfViewModel @Inject constructor(
    private val repository: BookshelfRepository
)
    : ViewModel() {

    init {
        viewModelScope.launch {
            val books = repository.fetchBooks("tolkien")
        }
    }
}