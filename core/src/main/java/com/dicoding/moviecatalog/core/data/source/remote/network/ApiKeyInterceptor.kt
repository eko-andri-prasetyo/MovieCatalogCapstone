package com.dicoding.moviecatalog.core.data.source.remote.network

import com.dicoding.moviecatalog.core.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val originalUrl = original.url

        val apiKey = BuildConfig.TMDB_API_KEY
        val url = originalUrl.newBuilder()
            .addQueryParameter("api_key", apiKey)
            .build()

        val request = original.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}
