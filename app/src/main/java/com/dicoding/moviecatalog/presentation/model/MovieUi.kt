package com.dicoding.moviecatalog.presentation.model

data class MovieUi(
    val id: Int,
    val title: String,
    val posterUrl: String,
    val voteAverage: Double,
    val releaseDate: String
)
