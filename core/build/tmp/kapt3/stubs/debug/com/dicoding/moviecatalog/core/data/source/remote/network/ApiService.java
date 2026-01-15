package com.dicoding.moviecatalog.core.data.source.remote.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/dicoding/moviecatalog/core/data/source/remote/network/ApiService;", "", "getMovieDetail", "Lcom/dicoding/moviecatalog/core/data/source/remote/response/MovieDetailResponse;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularMovies", "Lcom/dicoding/moviecatalog/core/data/source/remote/response/MovieListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.GET(value = "movie/popular")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPopularMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dicoding.moviecatalog.core.data.source.remote.response.MovieListResponse> $completion);
    
    @retrofit2.http.GET(value = "movie/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieDetail(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dicoding.moviecatalog.core.data.source.remote.response.MovieDetailResponse> $completion);
}