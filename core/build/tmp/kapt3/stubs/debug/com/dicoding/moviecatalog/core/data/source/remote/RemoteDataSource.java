package com.dicoding.moviecatalog.core.data.source.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/dicoding/moviecatalog/core/data/source/remote/RemoteDataSource;", "", "apiService", "Lcom/dicoding/moviecatalog/core/data/source/remote/network/ApiService;", "(Lcom/dicoding/moviecatalog/core/data/source/remote/network/ApiService;)V", "getMovieDetail", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dicoding/moviecatalog/core/data/source/remote/response/MovieDetailResponse;", "movieId", "", "getPopularMovies", "", "Lcom/dicoding/moviecatalog/core/data/source/remote/response/MovieResponse;", "core_debug"})
public final class RemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.dicoding.moviecatalog.core.data.source.remote.network.ApiService apiService = null;
    
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.dicoding.moviecatalog.core.data.source.remote.network.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.dicoding.moviecatalog.core.data.source.remote.response.MovieResponse>> getPopularMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.dicoding.moviecatalog.core.data.source.remote.response.MovieDetailResponse> getMovieDetail(int movieId) {
        return null;
    }
}