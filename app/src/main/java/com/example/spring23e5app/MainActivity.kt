package com.example.spring23e5app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.spring23e5app.Lecture1011.Lecture1011Activity
import com.example.spring23e5app.Lecture12.Lecture12Activity
import com.example.spring23e5app.Lecture6.Lecture6Activity
import com.example.spring23e5app.Lecture89.Lecture89Activity

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.move_btn).setOnClickListener {
            var intent = Intent(MainActivity@this,Lecture6Activity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.move_l89_btn).setOnClickListener {
            var intent = Intent(MainActivity@this,Lecture89Activity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.move_l1011_btn).setOnClickListener {
            //var intent = Intent(MainActivity@this,Lecture1011Activity::class.java)
            var intent = Intent(MainActivity@this,Lecture12Activity::class.java)
            startActivity(intent)
        }

    }
}