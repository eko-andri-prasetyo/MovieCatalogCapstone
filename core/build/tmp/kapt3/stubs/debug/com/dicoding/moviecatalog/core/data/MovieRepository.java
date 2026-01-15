package com.dicoding.moviecatalog.core.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J(\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\f0\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f0\bH\u0016J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/dicoding/moviecatalog/core/data/MovieRepository;", "Lcom/dicoding/moviecatalog/core/domain/repository/IMovieRepository;", "remote", "Lcom/dicoding/moviecatalog/core/data/source/remote/RemoteDataSource;", "local", "Lcom/dicoding/moviecatalog/core/data/source/local/LocalDataSource;", "(Lcom/dicoding/moviecatalog/core/data/source/remote/RemoteDataSource;Lcom/dicoding/moviecatalog/core/data/source/local/LocalDataSource;)V", "getFavoriteMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/dicoding/moviecatalog/core/domain/model/Movie;", "getMovieDetail", "Lcom/dicoding/moviecatalog/core/util/Resource;", "Lkotlin/Pair;", "Lcom/dicoding/moviecatalog/core/domain/model/MovieDetail;", "", "movieId", "", "getPopularMovies", "toggleFavorite", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public final class MovieRepository implements com.dicoding.moviecatalog.core.domain.repository.IMovieRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.dicoding.moviecatalog.core.data.source.remote.RemoteDataSource remote = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dicoding.moviecatalog.core.data.source.local.LocalDataSource local = null;
    
    public MovieRepository(@org.jetbrains.annotations.NotNull()
    com.dicoding.moviecatalog.core.data.source.remote.RemoteDataSource remote, @org.jetbrains.annotations.NotNull()
    com.dicoding.moviecatalog.core.data.source.local.LocalDataSource local) {
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