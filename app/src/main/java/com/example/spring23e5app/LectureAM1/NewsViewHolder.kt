package com.example.spring23e5app.LectureAM1

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.spring23e5app.R

class NewsViewHolder(singleNewsLayout: View)
    :RecyclerView.ViewHolder(singleNewsLayout)
{
        private val newsTitleTV:TextView by lazy {
            singleNewsLayout.findViewById(R.id.sr_news_title_tv)
        }

    private val newsDesTV:TextView by lazy {
        singleNewsLayout.findViewById(R.id.sr_news_des_tv)
    }

    private val newsDateTV:TextView by lazy {
        singleNewsLayout.findViewById(R.id.sr_news_date_tv)
    }

    fun bindData(newsItem:NewsDataModel)
    {
        newsTitleTV.text = newsItem.newsTitle
        newsDesTV.text = newsItem.newsDes

        newsDateTV.text = newsItem.newsDate
    }
}