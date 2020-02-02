package com.gaalbaat.jetnotes.ui


import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.gaalbaat.jetnotes.R
import com.gaalbaat.jetnotes.data.Author
import kotlinx.android.synthetic.main.fragment_authors.*

class AuthorsFragment : Fragment()  {
//    ,RecyclerViewClickListener
    private lateinit var viewModel: AuthorsViewModel
    private val adapter = AuthorsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_authors, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        adapter.listener = this
//        recycler_view_authors.adapter = adapter
//
//        viewModel.fetchAuthors()
//        viewModel.getRealtimeUpdates()
//
//        viewModel.authors.observe(viewLifecycleOwner, Observer {
//            adapter.setAuthors(it)
//        })
//
//        viewModel.author.observe(viewLifecycleOwner, Observer {
//            adapter.addAuthor(it)
//        })
//
        button_add.setOnClickListener {
            AddAuthorDialogFragment()
                .show(childFragmentManager, "")
        }
    }


//    override fun onRecyclerViewItemClicked(view: View, author: Author) {
//        when (view.id) {
//            R.id.button_edit -> {
//                EditAuthorDialogFragment(author).show(childFragmentManager, "")
//            }
//            R.id.button_delete -> {
//                AlertDialog.Builder(requireContext()).also {
//                    it.setTitle(getString(R.string.delete_confirmation))
//                    it.setPositiveButton(getString(R.string.yes)) { dialog, which ->
//                        viewModel.deleteAuthor(author)
//                    }
//                }.create().show()
//            }
//        }
//    }
}
