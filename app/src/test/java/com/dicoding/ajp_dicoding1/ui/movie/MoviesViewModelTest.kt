package com.dicoding.ajp_dicoding1.ui.movie

import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull

class MoviesViewModelTest {

    private lateinit var viewModel: MoviesViewModel

    @Before
    fun setUp() {
        viewModel = MoviesViewModel()
    }

    @Test
    fun testGetMovie() {
        val movies = viewModel.getMovie()
        assertNotNull(movies)
        assertEquals(10, movies.size)
    }
}