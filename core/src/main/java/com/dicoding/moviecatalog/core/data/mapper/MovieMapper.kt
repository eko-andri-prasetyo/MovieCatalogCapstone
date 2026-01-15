package com.dicoding.moviecatalog.core.data.mapper

import com.dicoding.moviecatalog.core.data.source.local.entity.MovieEntity
import com.dicoding.moviecatalog.core.data.source.remote.response.MovieDetailResponse
import com.dicoding.moviecatalog.core.data.source.remote.response.MovieResponse
import com.dicoding.moviecatalog.core.domain.model.Movie
import com.dicoding.moviecatalog.core.domain.model.MovieDetail

private const val IMG_BASE = "https://image.tmdb.org/t/p/w500"

object MovieMapper {

    fun responseToDomain(input: MovieResponse): Movie = Movie(
        id = input.id,
        title = input.title,
        posterUrl = IMG_BASE + (input.posterPath ?: ""),
        voteAverage = input.voteAverage,
        releaseDate = input.releaseDate ?: "-"
    )

    fun entityToDomain(input: MovieEntity): Movie = Movie(
        id = input.id,
        title = input.title,
        posterUrl = input.posterUrl,
        voteAverage = input.voteAverage,
        releaseDate = input.releaseDate
    )

    fun domainToEntity(input: Movie): MovieEntity = MovieEntity(
        id = input.id,
        title = input.title,
        posterUrl = input.posterUrl,
        voteAverage = input.voteAverage,
        releaseDate = input.releaseDate
    )

    fun detailResponseToDomain(input: MovieDetailResponse): MovieDetail = MovieDetail(
        id = input.id,
        title = input.title,
        posterUrl = IMG_BASE + (input.posterPath ?: ""),
        backdropUrl = IMG_BASE + (input.backdropPath ?: ""),
        voteAverage = input.voteAverage,
        releaseDate = input.releaseDate ?: "-",
        overview = input.overview ?: "-"
    )
}
