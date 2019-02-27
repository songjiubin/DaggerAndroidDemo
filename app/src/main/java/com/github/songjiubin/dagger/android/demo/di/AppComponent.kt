package com.github.songjiubin.dagger.android.demo.di

import com.github.songjiubin.dagger.android.demo.DemoApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton
import dagger.android.AndroidInjector


@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class]
)
interface AppComponent : AndroidInjector<DemoApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DemoApplication>()
}