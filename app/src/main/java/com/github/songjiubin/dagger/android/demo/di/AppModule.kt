package com.github.songjiubin.dagger.android.demo.di

import android.os.Build.MODEL
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideModel(): String {
        return MODEL
    }

}
