package com.dicoding.moviecatalog.presentation.detail

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.bumptech.glide.Glide
import com.dicoding.moviecatalog.databinding.ActivityDetailBinding
import com.dicoding.moviecatalog.presentation.common.UiState
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.collectLatest
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private val movieId: Int by lazy { intent.getIntExtra(EXTRA_MOVIE_ID, -1) }

    private val viewModel: DetailViewModel by viewModel { parametersOf(movieId) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        observe()
        binding.btnFavorite.setOnClickListener { viewModel.toggleFavorite() }
    }

    private fun observe() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collectLatest { state ->
                    when (state) {
                        is UiState.Loading -> {
                            binding.progressBar.visibility = View.VISIBLE
                            binding.content.visibility = View.GONE
                            binding.tvError.visibility = View.GONE
                        }
                        is UiState.Success -> {
                            val d = state.data
                            binding.progressBar.visibility = View.GONE
                            binding.content.visibility = View.VISIBLE
                            binding.tvError.visibility = View.GONE

                            binding.tvTitle.text = d.title
                            binding.tvMeta.text = "⭐ ${d.voteAverage} • ${d.releaseDate}"
                            binding.tvOverview.text = d.overview
                            binding.btnFavorite.text = if (d.isFavorite) "Remove Favorite" else "Add Favorite"

                            Glide.with(this@DetailActivity).load(d.backdropUrl).centerCrop().into(binding.ivBackdrop)
                            Glide.with(this@DetailActivity).load(d.posterUrl).centerCrop().into(binding.ivPoster)
                        }
                        is UiState.Error -> {
                            binding.progressBar.visibility = View.GONE
                            binding.content.visibility = View.GONE
                            binding.tvError.visibility = View.VISIBLE
                            binding.tvError.text = state.message
                        }
                    }
                }
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }

    companion object {
        const val EXTRA_MOVIE_ID = "extra_movie_id"
    }
}
