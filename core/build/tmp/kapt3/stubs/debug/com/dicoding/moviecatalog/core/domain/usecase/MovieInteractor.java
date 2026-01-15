package com.dicoding.moviecatalog.core.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J(\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n0\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n0\u0006H\u0016J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/dicoding/moviecatalog/core/domain/usecase/MovieInteractor;", "Lcom/dicoding/moviecatalog/core/domain/usecase/MovieUseCase;", "repository", "Lcom/dicoding/moviecatalog/core/domain/repository/IMovieRepository;", "(Lcom/dicoding/moviecatalog/core/domain/repository/IMovieRepository;)V", "getFavoriteMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/dicoding/moviecatalog/core/domain/model/Movie;", "getMovieDetail", "Lcom/dicoding/moviecatalog/core/util/Resource;", "Lkotlin/Pair;", "Lcom/dicoding/moviecatalog/core/domain/model/MovieDetail;", "", "movieId", "", "getPopularMovies", "toggleFavorite", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public final class MovieInteractor implements com.dicoding.moviecatalog.core.domain.usecase.MovieUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.dicoding.moviecatalog.core.domain.repository.IMovieRepository repository = null;
    
    public MovieInteractor(@org.jetbrains.annotations.NotNull()
    com.dicoding.moviecatalog.core.domain.repository.IMovieRepository repository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.dicoding.moviecatalog.core.util.Resource<java.util.List<com.dicoding.moviecatalog.core.domain.model.Movie>>> getPopularMovies() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.dicoding.moviecatalog.core.util.Resource<kotlin.Pair<com.dicoding.moviecatalog.core.domain.model.MovieDetail, java.lang.Boolean>>> getMovieDetail(int movieId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.dicoding.moviecatalog.core.domain.model.Movie>> getFavoriteMovies() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object toggleFavorite(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}