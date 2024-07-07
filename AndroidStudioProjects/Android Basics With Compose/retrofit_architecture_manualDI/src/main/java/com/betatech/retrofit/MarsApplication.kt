package com.betatech.retrofit

import android.app.Application
import com.betatech.retrofit.di.AppContainer
import com.betatech.retrofit.di.DefaultAppContainer

class MarsApplication: Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}