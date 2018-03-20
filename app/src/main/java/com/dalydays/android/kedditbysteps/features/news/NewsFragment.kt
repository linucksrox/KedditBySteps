package com.dalydays.android.kedditbysteps.features.news

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dalydays.android.kedditbysteps.R
import com.dalydays.android.kedditbysteps.commons.inflate
import kotlinx.android.synthetic.main.news_fragment.*

/**
 * Created by edaly on 3/19/2018.
 */

class NewsFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        val view = inflater?.inflate(R.layout.news_fragment, container, false)
        // using Extensions.kt, we can avoid using the line above, and instead use the line below
        val view = container?.inflate(R.layout.news_fragment)

        // using Kotlin synthetic properties, directly access XML elements by ID
        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(context)

        return view
    }

}