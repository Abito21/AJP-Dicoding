package com.dicoding.ajp_dicoding1.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.ajp_dicoding1.R
import com.dicoding.ajp_dicoding1.ui.movie.MoviesFragment
import com.dicoding.ajp_dicoding1.ui.tvshow.TvShowsFragment
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSectionPager()

    }

    // Menampilkan fragment untuk Movies dan Tv Shows pada main activity.
    private fun setSectionPager() {

        val fragmentList = listOf(MoviesFragment(), TvShowsFragment())
        val tbTitle = listOf("Movies", "Tv Shows")

        viewpage.adapter = SectionPagerAdapter(fragmentList, this.supportFragmentManager, lifecycle)
        TabLayoutMediator(tabLay2, viewpage){tab, position ->
            tab.text = tbTitle[position]
        }.attach()
    }

}