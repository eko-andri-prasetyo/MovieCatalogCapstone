package com.dicoding.moviecatalog.core.data

import com.dicoding.moviecatalog.core.data.mapper.MovieMapper
import com.dicoding.moviecatalog.core.data.source.local.LocalDataSource
import com.dicoding.moviecatalog.core.data.source.remote.RemoteDataSource
import com.dicoding.moviecatalog.core.domain.model.Movie
import com.dicoding.moviecatalog.core.domain.model.MovieDetail
import com.dicoding.moviecatalog.core.domain.repository.IMovieRepository
import com.dicoding.moviecatalog.core.util.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.withContext

class MovieRepository(
    private val remote: RemoteDataSource,
    private val local: LocalDataSource
) : IMovieRepository {

    override fun getPopularMovies(): Flow<Resource<List<Movie>>> = flow {
        emit(Resource.Loading())
        try {
            val movies = remote.getPopularMovies()
                .map { list -> list.map(MovieMapper::responseToDomain) }
                .first()
            emit(Resource.Success(movies))
        } catch (e: Exception) {
            // Jangan tampilkan pesan exception mentah ke UI.
            // (Error detail bisa dilihat di Logcat bila diperlukan.)
            emit(Resource.Error("Gagal memuat daftar film. Periksa koneksi lalu coba lagi."))
        }
    }.flowOn(Dispatchers.IO)

    override fun getMovieDetail(movieId: Int): Flow<Resource<Pair<MovieDetail, Boolean>>> = flow {
        emit(Resource.Loading())
        try {
            val detail = remote.getMovieDetail(movieId)
                .map(MovieMapper::detailResponseToDomain)
                .first()

            // favorite status dari db (Flow<Boolean>)
            val isFav = local.isFavorite(movieId).first()
            emit(Resource.Success(detail to isFav))
        } catch (e: Exception) {
            emit(Resource.Error("Gagal memuat detail film. Periksa koneksi lalu coba lagi."))
        }
    }.flowOn(Dispatchers.IO)

    override fun getFavoriteMovies(): Flow<List<Movie>> =
        local.getFavoriteMovies()
            .map { list -> list.map(MovieMapper::entityToDomain) }
            .flowOn(Dispatchers.IO)

    override suspend fun toggleFavorite(movieId: Int) {
        withContext(Dispatchers.IO) {
            val isFav = local.isFavorite(movieId).first()
            if (isFav) {
                local.deleteFavoriteById(movieId)
            } else {
                // agar bisa insert, ambil detail dari network lalu konversi ke Movie (lebih ringan)
                val detail = remote.getMovieDetail(movieId)
                    .map(MovieMapper::detailResponseToDomain)
                    .first()
                val movie = Movie(
                    id = detail.id,
                    title = detail.title,
                    posterUrl = detail.posterUrl,
                    voteAverage = detail.voteAverage,
                    releaseDate = detail.releaseDate
                )
                local.insertFavorite(MovieMapper.domainToEntity(movie))
            }
        }
    }
}
