package com.dicoding.moviecatalog.core.di

import androidx.room.Room
import com.dicoding.moviecatalog.core.data.MovieRepository
import com.dicoding.moviecatalog.core.data.source.local.LocalDataSource
import com.dicoding.moviecatalog.core.data.source.local.room.MovieDatabase
import com.dicoding.moviecatalog.core.data.source.remote.RemoteDataSource
import com.dicoding.moviecatalog.core.data.source.remote.network.ApiKeyInterceptor
import com.dicoding.moviecatalog.core.data.source.remote.network.ApiService
import com.dicoding.moviecatalog.core.domain.repository.IMovieRepository
import com.dicoding.moviecatalog.core.domain.usecase.MovieInteractor
import com.dicoding.moviecatalog.core.domain.usecase.MovieUseCase
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SupportFactory
import okhttp3.CertificatePinner
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

private const val BASE_URL = "https://api.themoviedb.org/3/"
private const val HOST_NAME = "api.themoviedb.org"

val coreModule = module {

    single {
        // Correct Certificate Pinning based on the latest Logcat output
        val certificatePinner = CertificatePinner.Builder()
            .add(HOST_NAME, "sha256/f78NVAesYtdZ9OGSbK7VtGQkSIVykh3DnduuLIJHMu4=")
            .add(HOST_NAME, "sha256/G9LNNAql897egYsabashkzUCTEJkWBzgoEtk8X/678c=")
            .add(HOST_NAME, "sha256/++MBgDH5WGvL9Bcn5Be30cRcL0f5O+NyoXuWtQdX1aI=")
            .build()

        val logging = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        
        OkHttpClient.Builder()
            .addInterceptor(ApiKeyInterceptor())
            .addInterceptor(logging)
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .certificatePinner(certificatePinner)
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single<ApiService> { get<Retrofit>().create(ApiService::class.java) }

    single { RemoteDataSource(get()) }

    single {
        val passphrase = SQLiteDatabase.getBytes("dicoding_capstone".toCharArray())
        val factory = SupportFactory(passphrase)
        
        Room.databaseBuilder(
            androidContext(),
            MovieDatabase::class.java,
            "movie_db"
        )
        .fallbackToDestructiveMigration()
        .openHelperFactory(factory)
        .build()
    }

    single { get<MovieDatabase>().movieDao() }
    single { LocalDataSource(get()) }

    single<IMovieRepository> { MovieRepository(get(), get()) }

    single<MovieUseCase> { MovieInteractor(get()) }
}
