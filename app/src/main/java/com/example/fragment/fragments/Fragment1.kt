package com.example.fragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.fragment.Communicator
import com.example.fragment.R

class Fragment1 : Fragment() {

    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate layout untuk fragment

        val view = inflater.inflate(R.layout.fragment_1, container, false)
        communicator =
        activity as Communicator

        // inisiasi button dan text message
        val button: Button = view.findViewById(R.id.sendBtn)
        val textMessage: EditText = view.findViewById(R.id.messageInput)

        // pass data ke interface ketika tombol di click
        button.setOnClickListener {
            communicator.passData(textMessage.text.toString())
        }

        return view

    }
}