package com.gaalbaat.jetnotes.ui

import android.view.View
import com.gaalbaat.jetnotes.data.Author

interface RecyclerViewClickListener {
    fun onRecyclerViewItemClicked(view: View, author: Author)
}