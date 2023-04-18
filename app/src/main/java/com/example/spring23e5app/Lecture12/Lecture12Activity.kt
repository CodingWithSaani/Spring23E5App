package com.example.spring23e5app.Lecture12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.example.spring23e5app.R

class Lecture12Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture12)

        findViewById<FragmentContainerView>(R.id.container)?.let {
            val parentFragment = ParentFragment()

        }
    }
}