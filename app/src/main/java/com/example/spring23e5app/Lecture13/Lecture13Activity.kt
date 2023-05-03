package com.example.spring23e5app.Lecture13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.example.spring23e5app.R

class Lecture13Activity : AppCompatActivity() {

    private val namesList = listOf("Monday","Tuesday","Wednesday","Thursday","Friday"
        ,"Saturday","Sunday")
    private val listView:ListView by lazy {
        findViewById(R.id.lec13_list_view)
    }

    private val listAdapter:ArrayAdapter<String> by lazy {
        ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1,namesList)
    }

    private val dataTV:TextView by lazy {
        findViewById(R.id.lec13_tv)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture13)

        listView.adapter = listAdapter
        listView.setOnItemClickListener { adapterView, view, itemPosition, l ->
            dataTV.text = adapterView.getItemAtPosition(itemPosition).toString()
        }
    }
}













