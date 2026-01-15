package com.dicoding.moviecatalog.core.domain.model

data class Movie(
    val id: Int,
    val title: String,
    val posterUrl: String,
    val voteAverage: Double,
    val releaseDate: String
)
