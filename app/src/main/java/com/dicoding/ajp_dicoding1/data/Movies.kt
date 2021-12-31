package com.dicoding.ajp_dicoding1.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

// Using Parclize
@Parcelize
data class Movies (
    val id: String,
    val title: String,
    val description: String,
    val genre: String,
    val realeaseYear: String,
    val imgPoster: Int
) : Parcelable