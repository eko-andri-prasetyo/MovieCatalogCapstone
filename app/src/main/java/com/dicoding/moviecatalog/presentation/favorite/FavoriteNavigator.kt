package com.dicoding.moviecatalog.presentation.favorite

import android.content.Context
import android.content.Intent
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest

object FavoriteNavigator {
    private const val MODULE_NAME = "favorite"
    private const val FAVORITE_ACTIVITY = "com.dicoding.moviecatalog.favorite.FavoriteActivity"

    fun openFavorite(context: Context) {
        val manager = SplitInstallManagerFactory.create(context)
        if (manager.installedModules.contains(MODULE_NAME)) {
            launchFavoriteActivity(context)
            return
        }

        val request = SplitInstallRequest.newBuilder()
            .addModule(MODULE_NAME)
            .build()

        manager.startInstall(request)
            .addOnSuccessListener { launchFavoriteActivity(context) }
            .addOnFailureListener {
                // fallback: do nothing
            }
    }

    private fun launchFavoriteActivity(context: Context) {
        val intent = Intent().setClassName(context.packageName, FAVORITE_ACTIVITY)
        context.startActivity(intent)
    }
}
