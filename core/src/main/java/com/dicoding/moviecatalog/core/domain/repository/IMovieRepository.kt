package com.dicoding.moviecatalog.core.domain.repository

import com.dicoding.moviecatalog.core.domain.model.Movie
import com.dicoding.moviecatalog.core.domain.model.MovieDetail
import com.dicoding.moviecatalog.core.util.Resource
import kotlinx.coroutines.flow.Flow

interface IMovieRepository {
    fun getPopularMovies(): Flow<Resource<List<Movie>>>
    fun getMovieDetail(movieId: Int): Flow<Resource<Pair<MovieDetail, Boolean>>>
    fun getFavoriteMovies(): Flow<List<Movie>>
    suspend fun toggleFavorite(movieId: Int)
}
