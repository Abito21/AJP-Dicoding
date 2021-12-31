package com.dicoding.ajp_dicoding1.ui.detail

import com.dicoding.ajp_dicoding1.utils.DataMoview
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class DetailMoviewViewModelTest {
    private lateinit var viewModel: DetailMoviewViewModel
    private val dataTvShows = DataMoview.getDataTvShows()[0]
    private val dataTvShowsId = dataTvShows.id
    private val dataMovies = DataMoview.getDataMovies()[0]
    private val dataMoviesId = dataMovies.id

    // Testing Data TvShows
    // Testing Unit untuk bagian pengambilan data tvShows
    @Before
    fun setUpTvShows() {
        viewModel = DetailMoviewViewModel()
        viewModel.setMoview(dataTvShowsId, "tvSHow")
    }

    @Test
    fun testGetTvShowsDetail() {
        viewModel.setMoview(dataTvShows.id, "tvShow")
        val tvShows = viewModel.getMoviewDetail()
        assertNotNull(tvShows)
        assertEquals(dataTvShows.id, tvShows.id)
        assertEquals(dataTvShows.title, tvShows.title)
        assertEquals(dataTvShows.description, tvShows.description)
        assertEquals(dataTvShows.genre, tvShows.genre)
        assertEquals(dataTvShows.realeaseYear, tvShows.realeaseYear)
        assertEquals(dataTvShows.imgPoster, tvShows.imgPoster)

    }

    // Testing Data Movies
    // Testing Unit untuk bagian pengambilan data tvShows
    @Before
    fun setUpMovies() {
        viewModel = DetailMoviewViewModel()
        viewModel.setMoview(dataMoviesId, "movie")
    }

    @Test
    fun testGetMoviesDetail() {
        viewModel.setMoview(dataMovies.id, "movie")
        val movies = viewModel.getMoviewDetail()
        assertNotNull(movies)
        assertEquals(dataMovies.id, movies.id)
        assertEquals(dataMovies.title, movies.title)
        assertEquals(dataMovies.description, movies.description)
        assertEquals(dataMovies.genre, movies.genre)
        assertEquals(dataMovies.realeaseYear, movies.realeaseYear)
        assertEquals(dataMovies.imgPoster, movies.imgPoster)
    }

}