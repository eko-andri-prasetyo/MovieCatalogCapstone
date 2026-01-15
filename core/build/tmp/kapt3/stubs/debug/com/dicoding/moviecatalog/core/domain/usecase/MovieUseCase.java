package com.dicoding.moviecatalog.core.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J(\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00070\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00070\u0003H&J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u00a6@\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/dicoding/moviecatalog/core/domain/usecase/MovieUseCase;", "", "getFavoriteMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/dicoding/moviecatalog/core/domain/model/Movie;", "getMovieDetail", "Lcom/dicoding/moviecatalog/core/util/Resource;", "Lkotlin/Pair;", "Lcom/dicoding/moviecatalog/core/domain/model/MovieDetail;", "", "movieId", "", "getPopularMovies", "toggleFavorite", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract interface MovieUseCase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.dicoding.moviecatalog.core.util.Resource<java.util.List<com.dicoding.moviecatalog.core.domain.model.Movie>>> getPopularMovies();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.dicoding.moviecatalog.core.util.Resource<kotlin.Pair<com.dicoding.moviecatalog.core.domain.model.MovieDetail, java.lang.Boolean>>> getMovieDetail(int movieId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dicoding.moviecatalog.core.domain.model.Movie>> getFavoriteMovies();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object toggleFavorite(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}