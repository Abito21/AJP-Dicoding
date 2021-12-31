package com.dicoding.ajp_dicoding1.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionPagerAdapter (private val fragmentList: List<Fragment>, fm: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fm ,lifecycle) {
    // Menjalankan fragment yang menampilkan layout Fragment.
    override fun createFragment(position: Int): Fragment = fragmentList[position]

    // Jumlah item yang dipanggil pada tiap fragment.
    override fun getItemCount(): Int = fragmentList.size

}