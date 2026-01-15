package com.dicoding.moviecatalog.presentation.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dicoding.moviecatalog.databinding.ItemMovieBinding
import com.dicoding.moviecatalog.presentation.model.MovieUi

class MovieAdapter(
    private val onClick: (Int) -> Unit
) : ListAdapter<MovieUi, MovieAdapter.MovieViewHolder>(DIFF) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class MovieViewHolder(
        private val binding: ItemMovieBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: MovieUi) {
            binding.tvTitle.text = item.title
            binding.tvMeta.text = "⭐ ${item.voteAverage} • ${item.releaseDate}"
            Glide.with(binding.root)
                .load(item.posterUrl)
                .centerCrop()
                .into(binding.ivPoster)

            binding.root.setOnClickListener { onClick(item.id) }
        }
    }

    companion object {
        private val DIFF = object : DiffUtil.ItemCallback<MovieUi>() {
            override fun areItemsTheSame(oldItem: MovieUi, newItem: MovieUi): Boolean = oldItem.id == newItem.id
            override fun areContentsTheSame(oldItem: MovieUi, newItem: MovieUi): Boolean = oldItem == newItem
        }
    }
}
