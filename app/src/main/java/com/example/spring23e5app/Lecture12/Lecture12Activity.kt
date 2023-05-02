package com.example.spring23e5app.Lecture12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.example.spring23e5app.R

class Lecture12Activity : AppCompatActivity(),communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture12)

        findViewById<FragmentContainerView>(R.id.container)?.let {
            val parentFragment = ParentFragment()
            supportFragmentManager.beginTransaction().add(it.id,parentFragment).commit()

        }
    }

    override fun sendDataFromParentToChild(data: String) {
        findViewById<FragmentContainerView>(R.id.container)?.let {
            val childFragment = ChildFragment.newInstance(data)
            supportFragmentManager.beginTransaction().replace(it.id,childFragment).commit()
        }
    }
}