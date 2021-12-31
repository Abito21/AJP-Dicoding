package com.dicoding.ajp_dicoding1.ui.detail

import android.annotation.SuppressLint
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.palette.graphics.Palette
import com.bumptech.glide.Glide
import com.dicoding.ajp_dicoding1.R
import com.dicoding.ajp_dicoding1.data.Movies
import com.google.android.material.appbar.AppBarLayout
import com.dicoding.ajp_dicoding1.databinding.ActivityDetailMoviewBinding
import kotlin.math.abs

class DetailMoviewActivity : AppCompatActivity(), AppBarLayout.OnOffsetChangedListener{
    // Variabel Object
    companion object{
        const val EXTRA_CATEGORY = "extra_category"
        const val EXTRA_MOVIEW = "extra_moview"
    }

    // Variabel View Binding
    private lateinit var detailMoviewBinding: ActivityDetailMoviewBinding
    private var mImageHidden = false
    private val percentShowImage = 20
    private var mMaxScroll = 0

    // Menampilkan atau membuat activity.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailMoviewBinding = ActivityDetailMoviewBinding.inflate(layoutInflater)
        setContentView(detailMoviewBinding.root)

        // Set Data Binding
        supportActionBar?.hide()
        detailMoviewBinding.toolbar.setNavigationOnClickListener { onBackPressed() }
        detailMoviewBinding.appBar.addOnOffsetChangedListener(this)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMoviewViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val dataId = extras.getString(EXTRA_MOVIEW)
            val dataCategory = extras.getString(EXTRA_CATEGORY)

            if (dataId != null && dataCategory != null) {
                viewModel.setMoview(dataId, dataCategory)
                val moview = viewModel.getMoviewDetail()
                setDataDetail(moview)
            }

        }
    }

    // Membuat tampilan bacground pada tiap item (card) menyesuaikan keadaan -
    // yang ada pada poster (warna mencolok dari poster).
    @SuppressLint("NewApi")
    private fun setColorPalette(poster: Int) {
        val bitmap = BitmapFactory.decodeResource(resources, poster)
        Palette.from(bitmap).generate { palette ->
            val defVal = resources.getColor(R.color.grey, theme)
            detailMoviewBinding.moviewDetail.setCardBackgroundColor(
                palette?.getDarkMutedColor(defVal) ?: defVal
            )
            detailMoviewBinding.collaps.setContentScrimColor(
                palette?.getDarkMutedColor(defVal) ?: defVal
            )
            window.statusBarColor = palette?.getDarkMutedColor(defVal) ?: defVal
        }
    }
    
    // Mengambil data mengenai informasi item melalui Movies.
    private fun setDataDetail(data: Movies) {
        detailMoviewBinding.tvDetailRealeaseGenre.text = StringBuilder("${data.realeaseYear} | ${data.genre}")
        detailMoviewBinding.collaps.title = data.title
        detailMoviewBinding.tvDetailDescription.text = data.description

        Glide.with(this)
            .load(data.imgPoster)
            .into(detailMoviewBinding.imgItemPosterDetail)

        detailMoviewBinding.imgItemPosterDetail.tag = data.imgPoster
        setColorPalette(data.imgPoster)
    }

    // Fungsi yang memberikan batasan pada setiap card item moview yang ada.
    // Khususnya jika di scroll kebawah sehingga lebih menarik.
    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        if (mMaxScroll == 0) mMaxScroll = appBarLayout!!.totalScrollRange

        val currentScrollPercentage: Int = (abs(verticalOffset) * 100 / mMaxScroll)
        if (currentScrollPercentage >= percentShowImage) {
            if (!mImageHidden) {
                mImageHidden = true
            }
        }

        if (currentScrollPercentage < percentShowImage) {
            if (mImageHidden) {
                mImageHidden = false
            }
        }

    }

}