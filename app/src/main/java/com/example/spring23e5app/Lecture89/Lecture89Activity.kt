package com.example.spring23e5app.Lecture89

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.spring23e5app.R

class Lecture89Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture89)

        Log.d("Lecture89","on create called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lecture89","on start called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lecture89","on resume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lecture89","on pause called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lecture89","on Restart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lecture89","on destroy called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lecture89","on stop called")
    }
}