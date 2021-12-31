package com.dicoding.ajp_dicoding1.ui.tvshow

import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull

class TvShowsViewModelTest {

    private lateinit var viewModel: TvShowsViewModel

    @Before
    fun setUp() {
        viewModel = TvShowsViewModel()
    }

    @Test
    fun testGetTvShow() {
        val tvShows = viewModel.getTvShow()
        assertNotNull(tvShows)
        assertEquals(10, tvShows
            .size)
    }
}