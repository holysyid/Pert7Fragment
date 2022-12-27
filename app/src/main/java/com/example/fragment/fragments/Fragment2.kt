package com.example.fragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragment.R


class Fragment2 : Fragment() {

    var displayMessage:String? =""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate layout
        val view = inflater.inflate(R.layout.fragment_2, container, false)
        val displayM: TextView = view.findViewById(R.id.displayMessage)

        // get data from bundle
        displayMessage = arguments?.getString("message")
        displayM.text = displayMessage
        return view
    }

}