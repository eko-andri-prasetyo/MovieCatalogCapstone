package com.dicoding.moviecatalog.presentation.mapper

import com.dicoding.moviecatalog.core.domain.model.Movie
import com.dicoding.moviecatalog.core.domain.model.MovieDetail
import com.dicoding.moviecatalog.presentation.model.MovieDetailUi
import com.dicoding.moviecatalog.presentation.model.MovieUi

object UiMapper {
    fun toMovieUi(domain: Movie): MovieUi = MovieUi(
        id = domain.id,
        title = domain.title,
        posterUrl = domain.posterUrl,
        voteAverage = domain.voteAverage,
        releaseDate = domain.releaseDate
    )

    fun toMovieDetailUi(domain: MovieDetail, isFavorite: Boolean): MovieDetailUi = MovieDetailUi(
        id = domain.id,
        title = domain.title,
        posterUrl = domain.posterUrl,
        backdropUrl = domain.backdropUrl,
        voteAverage = domain.voteAverage,
        releaseDate = domain.releaseDate,
        overview = domain.overview,
        isFavorite = isFavorite
    )
}
