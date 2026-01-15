package com.dicoding.moviecatalog.presentation.model

data class MovieDetailUi(
    val id: Int,
    val title: String,
    val posterUrl: String,
    val backdropUrl: String,
    val voteAverage: Double,
    val releaseDate: String,
    val overview: String,
    val isFavorite: Boolean
)
