package com.dicoding.moviecatalog.core.domain.model

data class MovieDetail(
    val id: Int,
    val title: String,
    val posterUrl: String,
    val backdropUrl: String,
    val voteAverage: Double,
    val releaseDate: String,
    val overview: String
)
