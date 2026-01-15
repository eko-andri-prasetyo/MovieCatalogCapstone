package com.dicoding.moviecatalog.core.data.source.local

import com.dicoding.moviecatalog.core.data.source.local.entity.MovieEntity
import com.dicoding.moviecatalog.core.data.source.local.room.MovieDao
import kotlinx.coroutines.flow.Flow

class LocalDataSource(
    private val dao: MovieDao
) {
    fun getFavoriteMovies(): Flow<List<MovieEntity>> = dao.getFavoriteMovies()
    fun isFavorite(id: Int): Flow<Boolean> = dao.isFavorite(id)
    suspend fun insertFavorite(movie: MovieEntity) = dao.insert(movie)
    suspend fun deleteFavoriteById(id: Int) = dao.deleteById(id)
}
