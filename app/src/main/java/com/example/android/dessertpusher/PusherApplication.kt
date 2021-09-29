package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

//Class that can be used from anywhere in the application. Extends the application class.

class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}