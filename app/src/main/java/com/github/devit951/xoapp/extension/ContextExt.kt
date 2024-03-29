package com.github.devit951.xoapp.extension

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Resources

val Int.dp
    get() = (Resources.getSystem().displayMetrics.density * this).toInt()

val Float.dp
    get() = Resources.getSystem().displayMetrics.density * this

inline fun <reified T: Activity> Context.startActivity() = startActivity(Intent(this, T::class.java))

inline fun <reified T: Activity> Context.intent(init: Intent.() -> Unit): Intent{
    return Intent(this, T::class.java).apply { init(this) }
}