package com.dalydays.android.kedditbysteps.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.dalydays.android.kedditbysteps.R
import com.dalydays.android.kedditbysteps.commons.adapter.ViewType
import com.dalydays.android.kedditbysteps.commons.adapter.ViewTypeDelegateAdapter
import com.dalydays.android.kedditbysteps.commons.inflate

/**
 * Created by Owner on 3/20/2018.
 */

class LoadingDelegateAdapter: ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {}

    class TurnsViewHolder(parent: ViewGroup): RecyclerView.ViewHolder(parent.inflate(R.layout.news_item_loading))
}