package com.dicoding.ajp_dicoding1.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.ajp_dicoding1.data.Movies
import com.dicoding.ajp_dicoding1.utils.DataMoview

class DetailMoviewViewModel: ViewModel() {
    // Variable Object
    companion object{
        const val TV_SHOWS = "tvShow"
        const val MOVIES = "movie"
    }

    private lateinit var moview: Movies
    // Fungsi yang memanggil data item, sesuai dengan ketagorinya yaitu tv show dan movie.
    fun setMoview(id: String, category: String) {
        when (category) {
            TV_SHOWS -> {
                for (tvShow in DataMoview.getDataTvShows()) {
                    if (tvShow.id == id) moview = tvShow
                }
            }

            MOVIES -> {
                for (movie in DataMoview.getDataMovies()) {
                    if (movie.id == id) moview = movie
                }
            }

        }
    }
    fun getMoviewDetail() = moview
}