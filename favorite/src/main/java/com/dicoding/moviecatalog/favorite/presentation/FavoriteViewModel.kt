package com.dicoding.moviecatalog.favorite.presentation

import androidx.lifecycle.ViewModel
import com.dicoding.moviecatalog.core.domain.usecase.MovieUseCase

class FavoriteViewModel(
    useCase: MovieUseCase
) : ViewModel() {
    val favorites = useCase.getFavoriteMovies()
}
