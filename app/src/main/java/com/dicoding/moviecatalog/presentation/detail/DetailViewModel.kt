package com.dicoding.moviecatalog.presentation.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.moviecatalog.core.domain.usecase.MovieUseCase
import com.dicoding.moviecatalog.core.util.Resource
import com.dicoding.moviecatalog.presentation.common.UiState
import com.dicoding.moviecatalog.presentation.mapper.UiMapper
import com.dicoding.moviecatalog.presentation.model.MovieDetailUi
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class DetailViewModel(
    private val movieId: Int,
    private val useCase: MovieUseCase
) : ViewModel() {

    val uiState: StateFlow<UiState<MovieDetailUi>> = useCase.getMovieDetail(movieId)
        .map { res ->
            when (res) {
                is Resource.Loading -> UiState.Loading
                is Resource.Error -> UiState.Error(res.message ?: "Unknown error")
                is Resource.Success -> {
                    val pair = res.data
                    if (pair == null) UiState.Error("Data kosong")
                    else UiState.Success(UiMapper.toMovieDetailUi(pair.first, pair.second))
                }
            }
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), UiState.Loading)

    fun toggleFavorite() {
        viewModelScope.launch {
            useCase.toggleFavorite(movieId)
        }
    }
}
