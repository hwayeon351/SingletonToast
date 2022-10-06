package com.example.singletontoast.singleton

import android.app.Application
import android.content.Context
import android.util.Log

class App : Application() {
    override fun onCreate() {
        Log.d("App", "onCreate()!!")
        super.onCreate()
        context = applicationContext
    }

    companion object {
        lateinit var context: Context
    }
}