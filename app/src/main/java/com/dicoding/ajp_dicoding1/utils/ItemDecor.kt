package com.dicoding.ajp_dicoding1.utils

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ItemDecor(private val spaceHeight: Int) : RecyclerView.ItemDecoration() {
    // Membuat batasan pada margin item.
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        with(outRect) {

            // Memanfaatkan elemen parent dan child.
            if (parent.getChildAdapterPosition(view) == 0) {
                top = spaceHeight
            }

            bottom = spaceHeight

        }
    }
}