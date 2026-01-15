package com.dicoding.moviecatalog.core.data.mapper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lcom/dicoding/moviecatalog/core/data/mapper/MovieMapper;", "", "()V", "detailResponseToDomain", "Lcom/dicoding/moviecatalog/core/domain/model/MovieDetail;", "input", "Lcom/dicoding/moviecatalog/core/data/source/remote/response/MovieDetailResponse;", "domainToEntity", "Lcom/dicoding/moviecatalog/core/data/source/local/entity/MovieEntity;", "Lcom/dicoding/moviecatalog/core/domain/model/Movie;", "entityToDomain", "responseToDomain", "Lcom/dicoding/moviecatalog/core/data/source/remote/response/MovieResponse;", "core_debug"})
public final class MovieMapper {
    @org.jetbrains.annotations.NotNull()
    public static final com.dicoding.moviecatalog.core.data.mapper.MovieMapper INSTANCE = null;
    
    private MovieMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dicoding.moviecatalog.core.domain.model.Movie responseToDomain(@org.jetbrains.annotations.NotNull()
    com.dicoding.moviecatalog.core.data.source.remote.response.MovieResponse input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dicoding.moviecatalog.core.domain.model.Movie entityToDomain(@org.jetbrains.annotations.NotNull()
    com.dicoding.moviecatalog.core.data.source.local.entity.MovieEntity input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dicoding.moviecatalog.core.data.source.local.entity.MovieEntity domainToEntity(@org.jetbrains.annotations.NotNull()
    com.dicoding.moviecatalog.core.domain.model.Movie input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dicoding.moviecatalog.core.domain.model.MovieDetail detailResponseToDomain(@org.jetbrains.annotations.NotNull()
    com.dicoding.moviecatalog.core.data.source.remote.response.MovieDetailResponse input) {
        return null;
    }
}