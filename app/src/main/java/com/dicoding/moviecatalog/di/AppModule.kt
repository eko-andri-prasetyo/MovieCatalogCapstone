package com.dicoding.moviecatalog.di

import com.dicoding.moviecatalog.presentation.detail.DetailViewModel
import com.dicoding.moviecatalog.presentation.main.MovieListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { MovieListViewModel(get()) }
    viewModel { (movieId: Int) -> DetailViewModel(movieId, get()) }
}
