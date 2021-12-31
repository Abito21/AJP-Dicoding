package com.dicoding.ajp_dicoding1.ui.tvshow

import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.ajp_dicoding1.databinding.FragmentTvShowsBinding
import com.dicoding.ajp_dicoding1.utils.ItemDecor

/**
 * A simple [Fragment] subclass.
 * Use the [TvShowsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TvShowsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var fragmentTvShowBinding: FragmentTvShowsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        fragmentTvShowBinding = FragmentTvShowsBinding.inflate(layoutInflater, container, false)
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvShowsViewModel::class.java]
            val tvShow = viewModel.getTvShow()
            val tvShowsAdapter = TvShowsAdapter()
            tvShowsAdapter.setTvShow(tvShow)

            val marginVertical = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics)
            with(fragmentTvShowBinding.rvTvshow) {
                addItemDecoration(ItemDecor(marginVertical.toInt()))
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = tvShowsAdapter
            }
        }

    }
}