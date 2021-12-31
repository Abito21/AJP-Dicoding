package com.dicoding.ajp_dicoding1.ui.tvshow

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
import com.dicoding.ajp_dicoding1.ui.detail.DetailMoviewViewModel.Companion.TV_SHOWS

class TvShowsAdapter: RecyclerView.Adapter<TvShowsAdapter.TvShowViewHolder>() {
    // Variable Objec Data
    private var tvShow = ArrayList<Movies>()

    // Konfigurasi awal Tv Shows Fragment
    fun setTvShow(tvShow: ArrayList<Movies>?) {
        if (tvShow.isNullOrEmpty()) return
        this.tvShow.clear()
        this.tvShow.addAll(tvShow)
    }

    // Mengambil data kemudian ditampilkan pada halaman fragment Tv Shows.
    class TvShowViewHolder(private val binding: ItemRowMoviesBinding) : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("NewApi")
        fun bind(tvShow: Movies) {
            with(binding) {
                tvTitle.text = tvShow.title
                tvRealease.text = tvShow.realeaseYear

                Glide.with(binding.root.context)
                    .load(tvShow.imgPoster)
                    .transform(RoundedCorners(28))
                    .into(imgItemPoster)

                val bitmap = BitmapFactory.decodeResource(itemView.context.resources, tvShow.imgPoster)

                Palette.from(bitmap).generate { palette ->
                    val defValue = itemView.resources.getColor(R.color.grey, itemView.context.theme)
                    cardMoview.setCardBackgroundColor(palette?.getDarkMutedColor(defValue) ?: defValue)
                }

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMoviewActivity::class.java)
                    intent.putExtra(DetailMoviewActivity.EXTRA_MOVIEW, tvShow.id)
                    intent.putExtra(DetailMoviewActivity.EXTRA_CATEGORY, TV_SHOWS)

                    itemView.context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount(): Int = tvShow.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemMovieBinding = ItemRowMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemMovieBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        holder.bind(tvShow[position])
    }

}