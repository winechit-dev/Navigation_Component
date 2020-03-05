package com.example.navigationcomponent

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import com.example.navigationcomponent.dummy.DummyContent

class MainActivity : AppCompatActivity(),ItemFragment.OnListFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
       Toast.makeText(this,item.toString(),Toast.LENGTH_LONG).show()
    }
}

