package com.dicoding.moviecatalog.core.domain.usecase

import com.dicoding.moviecatalog.core.domain.model.Movie
import com.dicoding.moviecatalog.core.domain.repository.IMovieRepository
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

class MovieInteractorTest {

    private lateinit var movieUseCase: MovieUseCase

    @Mock
    private lateinit var movieRepository: IMovieRepository

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        movieUseCase = MovieInteractor(movieRepository)
    }

    @Test
    fun `should get favorite movies from repository`() = runBlocking {
        val dummyMovies = listOf(
            Movie(1, "Title", "url", 8.0, "2024")
        )
        `when`(movieRepository.getFavoriteMovies()).thenReturn(flowOf(dummyMovies))

        val result = movieUseCase.getFavoriteMovies()
        
        result.collect { movies ->
            assertEquals(dummyMovies.size, movies.size)
            assertEquals(dummyMovies[0].title, movies[0].title)
        }
    }
}
