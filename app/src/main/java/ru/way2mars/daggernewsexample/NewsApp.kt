package ru.way2mars.daggernewsexample

import android.app.Application
import ru.way2mars.daggernewsexample.di.AppComponent
import ru.way2mars.daggernewsexample.di.DaggerAppComponent

class NewsApp: Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .application(this)
            .apiKey(BuildConfig.NEWS_API_KEY)
            .build()
    }

    override fun onCreate() {
        super.onCreate()
    }
}