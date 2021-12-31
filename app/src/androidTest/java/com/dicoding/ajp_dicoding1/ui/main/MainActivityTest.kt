package com.dicoding.ajp_dicoding1.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.dicoding.ajp_dicoding1.R
import com.dicoding.ajp_dicoding1.utils.DataMoview
import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Before
import org.junit.Test

class MainActivityTest {
    private val dataMovies = DataMoview.getDataMovies()
    private val dataTvShows = DataMoview.getDataTvShows()

    @Before
    fun setup() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun loadMovie() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovies.size))
    }

    @Test
    fun loadDataDetailMovies(){
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.collaps)).check(matches(isDisplayed()))
        onView(withId(R.id.collaps)).check(matches(withContentDescription(dataMovies[0].title)))
        onView(withId(R.id.tv_detail_realease_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_realease_genre)).check(matches(withText("${dataMovies[0].realeaseYear} | ${dataMovies[0].genre}")))
        onView(withId(R.id.tv_detail_description)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_description)).check(matches(withText(dataMovies[0].description)))
    }

    @Test
    fun loadTvShow() {
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataTvShows.size))
    }

    @Test
    fun loadDetailTvShows(){
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.collaps)).check(matches(isDisplayed()))
        onView(withId(R.id.collaps)).check(matches(withContentDescription(dataTvShows[0].title)))
        onView(withId(R.id.tv_detail_realease_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_realease_genre)).check(matches(withText("${dataTvShows[0].realeaseYear} | ${dataTvShows[0].genre}")))
        onView(withId(R.id.tv_detail_description)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_description)).check(matches(withText(dataTvShows[0].description)))
    }

}