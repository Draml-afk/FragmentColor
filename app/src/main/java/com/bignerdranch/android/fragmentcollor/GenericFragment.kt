package com.bignerdranch.android.fragmentcollor

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class GenericFragment : Fragment() {

    private var backgroundColor: Int = 0
    private var title: String = ""
    private var texColor: Int = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bundle = arguments
        if (bundle != null) {
            if (bundle.containsKey(FRAGMENT_COLOR)) {
                backgroundColor = bundle.getInt(FRAGMENT_COLOR)
            }

            if (bundle.containsKey(FRAGMENT_TITLE))
                title = bundle.getString(FRAGMENT_TITLE) ?: ""

            if (bundle.containsKey(TEXT_COLOR))
                texColor = bundle.getInt(TEXT_COLOR)
        }


        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.generic_fragment, container, false)

        val text_title: TextView = view.findViewById(R.id.text_title)
        text_title.text = title

        val text_Color: TextView = view.findViewById(R.id.text_title)
        text_Color.setTextColor(texColor)


        val frameLayout = view.findViewById<View>(R.id.frame_layout)
        frameLayout.setBackgroundColor(backgroundColor)



        return view
    }

    companion object {

        const val FRAGMENT_COLOR = "FRAGMENT_COLOR"
        const val FRAGMENT_TITLE = "FRAGMENT_TITLE"
        const val TEXT_COLOR = "TEXT_COLOR"


        fun newInstance(color: Int, name: String, textColor: Int = Color.BLACK): GenericFragment {
            val fragment = GenericFragment()
            val bundle = Bundle()
            bundle.putSerializable(FRAGMENT_COLOR, color)
            bundle.putString(FRAGMENT_TITLE, name)
            bundle.putSerializable(TEXT_COLOR, textColor)
            fragment.arguments = bundle
            return fragment
        }
    }
}