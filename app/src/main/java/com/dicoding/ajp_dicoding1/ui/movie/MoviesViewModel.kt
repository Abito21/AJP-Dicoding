package com.dicoding.ajp_dicoding1.ui.movie

import androidx.lifecycle.ViewModel
import com.dicoding.ajp_dicoding1.utils.DataMoview

class MoviesViewModel: ViewModel() {

    // Mengambil data dari DataMoview menggunakan fungsi getDataTvShows()
    fun getMovie() = DataMoview.getDataMovies()

}