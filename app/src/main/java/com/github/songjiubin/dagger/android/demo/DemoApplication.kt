package com.github.songjiubin.dagger.android.demo

import android.util.Log
import com.github.songjiubin.dagger.android.demo.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Inject


class DemoApplication : DaggerApplication() {
    private val tag = DaggerApplication::class.java.simpleName

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

    @Inject
    lateinit var model: String

    @Inject
    fun logInjection() {
        Log.i(tag, "Injecting $model")
    }
}