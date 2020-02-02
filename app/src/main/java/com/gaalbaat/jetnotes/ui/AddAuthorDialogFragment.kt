package com.gaalbaat.jetnotes.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import com.gaalbaat.jetnotes.R
import com.gaalbaat.jetnotes.data.Author
import kotlinx.android.synthetic.main.fragment_add_author.*

/**
 * A simple [Fragment] subclass.
 */
class AddAuthorDialogFragment : DialogFragment() {

    private lateinit var viewModel: AuthorsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        viewModel = ViewModelProviders.of(this).get(AuthorsViewModel::class.java)
        return inflater.inflate(R.layout.fragment_add_author, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_TITLE, android.R.style.Theme_DeviceDefault_Light_Dialog_MinWidth)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        viewModel.result.observe(viewLifecycleOwner, Observer {
//            val message = if (it == null) {
//                getString(R.string.author_added)
//            } else {
//                getString(R.string.error, it.message)
//            }
//            Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
//            dismiss()
//        })

        button_add.setOnClickListener {
            val name = edit_text_name.text.toString().trim()
            if (name.isEmpty()) {
                input_layout_name.error = getString(R.string.error_field_required)
                return@setOnClickListener
            }
//            val author = Author()
//            author.name = name
//            viewModel.addAuthor(author)
        }
    }
}
