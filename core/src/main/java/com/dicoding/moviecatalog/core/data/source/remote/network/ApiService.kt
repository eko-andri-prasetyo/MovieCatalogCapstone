package com.dicoding.moviecatalog.core.data.source.remote.network

import com.dicoding.moviecatalog.core.data.source.remote.response.MovieDetailResponse
import com.dicoding.moviecatalog.core.data.source.remote.response.MovieListResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("movie/popular")
    suspend fun getPopularMovies(): MovieListResponse

    @GET("movie/{id}")
    suspend fun getMovieDetail(@Path("id") id: Int): MovieDetailResponse
}
