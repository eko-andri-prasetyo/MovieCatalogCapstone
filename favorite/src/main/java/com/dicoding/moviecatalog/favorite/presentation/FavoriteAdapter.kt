package com.dicoding.moviecatalog.favorite.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dicoding.moviecatalog.favorite.databinding.ItemFavoriteBinding
import com.dicoding.moviecatalog.core.domain.model.Movie

class FavoriteAdapter(
    private val onClick: (Int) -> Unit
) : ListAdapter<Movie, FavoriteAdapter.FavViewHolder>(DIFF) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavViewHolder {
        val binding = ItemFavoriteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FavViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FavViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class FavViewHolder(
        private val binding: ItemFavoriteBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Movie) {
            binding.tvTitle.text = item.title
            binding.tvMeta.text = "⭐ ${item.voteAverage} • ${item.releaseDate}"
            Glide.with(binding.root).load(item.posterUrl).centerCrop().into(binding.ivPoster)
            binding.root.setOnClickListener { onClick(item.id) }
        }
    }

    companion object {
        private val DIFF = object : DiffUtil.ItemCallback<Movie>() {
            override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean = oldItem.id == newItem.id
            override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean = oldItem == newItem
        }
    }
}
