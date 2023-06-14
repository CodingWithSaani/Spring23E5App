package com.example.spring23e5app.LectureAM1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spring23e5app.R

class NewsAdapterRV
    (val context:Context)
    :RecyclerView.Adapter<NewsViewHolder>()
{

    var newsCollection = ArrayList<NewsDataModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(LayoutInflater.from(context).inflate(
            R.layout.single_item_news_layout,parent,false))
    }

    fun setData(newsItemsList:ArrayList<NewsDataModel>)
    {
        newsCollection.clear()
        newsCollection.addAll(newsItemsList)

        notifyDataSetChanged()
    }
    override fun getItemCount(): Int = newsCollection.size

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bindData(newsCollection[position])
    }
}