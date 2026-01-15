package com.dicoding.moviecatalog.core.data.source.remote

import com.dicoding.moviecatalog.core.data.source.remote.network.ApiService
import com.dicoding.moviecatalog.core.data.source.remote.response.MovieDetailResponse
import com.dicoding.moviecatalog.core.data.source.remote.response.MovieResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RemoteDataSource(
    private val apiService: ApiService
) {
    fun getPopularMovies(): Flow<List<MovieResponse>> = flow {
        val response = apiService.getPopularMovies()
        emit(response.results)
    }

    fun getMovieDetail(movieId: Int): Flow<MovieDetailResponse> = flow {
        emit(apiService.getMovieDetail(movieId))
    }
}
