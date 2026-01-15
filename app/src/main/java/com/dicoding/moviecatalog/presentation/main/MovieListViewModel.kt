package com.dicoding.moviecatalog.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.moviecatalog.core.domain.usecase.MovieUseCase
import com.dicoding.moviecatalog.core.util.Resource
import com.dicoding.moviecatalog.presentation.common.UiState
import com.dicoding.moviecatalog.presentation.mapper.UiMapper
import com.dicoding.moviecatalog.presentation.model.MovieUi
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class MovieListViewModel(
    private val useCase: MovieUseCase
) : ViewModel() {

    private val refreshTrigger = MutableSharedFlow<Unit>(replay = 1)
    private val searchQuery = MutableStateFlow("")

    val uiState: StateFlow<UiState<List<MovieUi>>> = refreshTrigger
        .onStart { emit(Unit) }
        .flatMapLatest { useCase.getPopularMovies() }
        .combine(searchQuery) { res, query ->
            res to query
        }
        .map { (res, query) ->
            when (res) {
                is Resource.Loading -> UiState.Loading
                is Resource.Error -> UiState.Error(res.message ?: "Unknown error")
                is Resource.Success -> {
                    val list = (res.data ?: emptyList()).map(UiMapper::toMovieUi)
                    val filtered = if (query.isBlank()) list else {
                        list.filter { it.title.contains(query, ignoreCase = true) }
                    }
                    UiState.Success(filtered)
                }
            }
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), UiState.Loading)

    fun refresh() {
        viewModelScope.launch { refreshTrigger.emit(Unit) }
    }

    fun setSearchQuery(query: String) {
        searchQuery.value = query
    }
}
