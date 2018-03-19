@file:JvmName("ExtensionsUtils")

package com.dalydays.android.kedditbysteps.commons

/**
 * Created by edaly on 3/19/2018.
 */

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}