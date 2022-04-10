package com.iamageo.minimalist_todo

import android.app.Application
import timber.log.Timber

class ToDoApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}