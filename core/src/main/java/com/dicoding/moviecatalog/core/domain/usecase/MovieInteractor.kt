package com.dicoding.moviecatalog.core.domain.usecase

import com.dicoding.moviecatalog.core.domain.model.Movie
import com.dicoding.moviecatalog.core.domain.model.MovieDetail
import com.dicoding.moviecatalog.core.domain.repository.IMovieRepository
import com.dicoding.moviecatalog.core.util.Resource
import kotlinx.coroutines.flow.Flow

class MovieInteractor(
    private val repository: IMovieRepository
) : MovieUseCase {

    override fun getPopularMovies(): Flow<Resource<List<Movie>>> = repository.getPopularMovies()

    override fun getMovieDetail(movieId: Int): Flow<Resource<Pair<MovieDetail, Boolean>>> =
        repository.getMovieDetail(movieId)

    override fun getFavoriteMovies(): Flow<List<Movie>> = repository.getFavoriteMovies()

    override suspend fun toggleFavorite(movieId: Int) = repository.toggleFavorite(movieId)
}
