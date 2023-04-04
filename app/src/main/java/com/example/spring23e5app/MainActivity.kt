package com.example.spring23e5app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.spring23e5app.Lecture6.Lecture6Activity

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.move_btn).setOnClickListener {
            var intent = Intent(MainActivity@this,Lecture6Activity::class.java)
            startActivity(intent)
        }
    }
}