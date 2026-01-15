package com.dicoding.moviecatalog.core.data.source.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/dicoding/moviecatalog/core/data/source/local/LocalDataSource;", "", "dao", "Lcom/dicoding/moviecatalog/core/data/source/local/room/MovieDao;", "(Lcom/dicoding/moviecatalog/core/data/source/local/room/MovieDao;)V", "deleteFavoriteById", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/dicoding/moviecatalog/core/data/source/local/entity/MovieEntity;", "insertFavorite", "movie", "(Lcom/dicoding/moviecatalog/core/data/source/local/entity/MovieEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavorite", "", "core_debug"})
public final class LocalDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.dicoding.moviecatalog.core.data.source.local.room.MovieDao dao = null;
    
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.dicoding.moviecatalog.core.data.source.local.room.MovieDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.dicoding.moviecatalog.core.data.source.local.entity.MovieEntity>> getFavoriteMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isFavorite(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertFavorite(@org.jetbrains.annotations.NotNull()
    com.dicoding.moviecatalog.core.data.source.local.entity.MovieEntity movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteFavoriteById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}