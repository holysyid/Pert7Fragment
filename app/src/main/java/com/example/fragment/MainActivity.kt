package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fragment.fragments.Fragment1
import com.example.fragment.fragments.Fragment2


class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inisiasi instance Fragment1
        val fragment1 = Fragment1()

        // Frame manager replace Fragment2 frame layout dengan data Fragment1
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout,fragment1)
            .commit()
    }

    override fun passData(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("message", editTextInput)
        //deklarasi transaksi komunikasi antar fragment
        Toast.makeText(this, editTextInput, Toast.LENGTH_SHORT).show()
        val transaction = this.supportFragmentManager.beginTransaction()

        // inisiasi instance fragment2
        val fragment2 = Fragment2()
        //declare dari fragment mana

        //fungsi if fragmenta >> b, fragment b>>a

        fragment2.arguments = bundle
        transaction.replace(R.id.frameLayout,fragment2)
        transaction.commit()
    }
}
