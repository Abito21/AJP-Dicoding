package com.dicoding.ajp_dicoding1.ui.tvshow

import androidx.lifecycle.ViewModel
import com.dicoding.ajp_dicoding1.utils.DataMoview

class TvShowsViewModel: ViewModel() {

    // Mengambil data dari DataMoview menggunakan fungsi getDataTvShows()
    fun getTvShow() = DataMoview.getDataTvShows()

}