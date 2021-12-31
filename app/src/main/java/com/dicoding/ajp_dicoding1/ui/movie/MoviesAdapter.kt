package com.dicoding.ajp_dicoding1.ui.movie

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.palette.graphics.Palette
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.dicoding.ajp_dicoding1.R
import com.dicoding.ajp_dicoding1.data.Movies
import com.dicoding.ajp_dicoding1.databinding.ItemRowMoviesBinding
import com.dicoding.ajp_dicoding1.ui.detail.DetailMoviewActivity
import com.dicoding.ajp_dicoding1.ui.detail.DetailMoviewViewModel.Companion.MOVIES

class MoviesAdapter: RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {
    // Variable Object Data
    private var movie = ArrayList<Movies>()

    // Konfigurasi awal Movies Fragment
    fun setMovie(movies: ArrayList<Movies>?){
        if (movies.isNullOrEmpty()) return
        this.movie.clear()
        this.movie.addAll(movies)
    }

    // Mengambil data kemudian ditampilkan pada halaman fragment Movies.
    class MoviesViewHolder(private val binding: ItemRowMoviesBinding) : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("NewApi")
        fun bind(movie: Movies) {
            with(binding) {
                tvTitle.text = movie.title
                tvRealease.text = movie.realeaseYear

                Glide.with(itemView.context)
                    .load(movie.imgPoster)
                    .transform(RoundedCorners(28))
                    .into(imgItemPoster)

                val bitmap = BitmapFactory.decodeResource(itemView.context.resources, movie.imgPoster)

                Palette.from(bitmap).generate { palette ->
                    val defValue = itemView.resources.getColor(R.color.grey, itemView.context.theme)
                    cardMoview.setCardBackgroundColor(palette?.getDarkMutedColor(defValue) ?: defValue)
                }

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMoviewActivity::class.java)
                    intent.putExtra(DetailMoviewActivity.EXTRA_MOVIEW, movie.id)
                    intent.putExtra(DetailMoviewActivity.EXTRA_CATEGORY, MOVIES)

                    itemView.context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount(): Int = movie.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val itemMovieBinding = ItemRowMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviesViewHolder(itemMovieBinding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bind(movie[position])
    }

}