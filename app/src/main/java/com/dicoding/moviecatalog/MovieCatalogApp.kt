package com.dicoding.moviecatalog

import android.app.Application
import com.dicoding.moviecatalog.di.appModule
import com.dicoding.moviecatalog.presentation.favorite.FavoriteFeature
import com.dicoding.moviecatalog.core.di.coreModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MovieCatalogApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MovieCatalogApp)
            modules(coreModule, appModule)
        }
        // Dynamic Feature module favorit akan diload saat feature terinstal (lihat FavoriteFeature)
        FavoriteFeature.init(this)
    }
}
