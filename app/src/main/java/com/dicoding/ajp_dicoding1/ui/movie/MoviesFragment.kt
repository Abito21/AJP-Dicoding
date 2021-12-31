package com.dicoding.ajp_dicoding1.ui.movie

import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.ajp_dicoding1.databinding.FragmentMoviesBinding
import com.dicoding.ajp_dicoding1.utils.ItemDecor

/**
 * A simple [Fragment] subclass.
 * Use the [MoviesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MoviesFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var fragmentMovieBinding: FragmentMoviesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        fragmentMovieBinding = FragmentMoviesBinding.inflate(layoutInflater, container, false)
        return fragmentMovieBinding.root
    }

    // Create Fragment View
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {

            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MoviesViewModel::class.java]
            val movie = viewModel.getMovie()
            val moviesAdapter = MoviesAdapter()
            moviesAdapter.setMovie(movie)

            val marginVertical = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics)
            with(fragmentMovieBinding.rvMovie) {
                addItemDecoration(ItemDecor(marginVertical.toInt()))
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = moviesAdapter
            }

        }

    }

}