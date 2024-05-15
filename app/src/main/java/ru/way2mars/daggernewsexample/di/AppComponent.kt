package ru.way2mars.daggernewsexample.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import ru.way2mars.daggernewsexample.news_api.NewsService
import javax.inject.Qualifier
import javax.inject.Scope

@[AppScope Component(modules = [AppModule::class])]
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        @BindsInstance
        fun apiKey(@NewsApiQualifier apiKey: String): Builder

        fun build(): AppComponent
    }
}

@Module
class AppModule {
    @Provides
    @AppScope
    fun provideNewsService(@NewsApiQualifier apiKey: String): NewsService{
        return NewsService(apiKey)
    }

}

@Qualifier
annotation class NewsApiQualifier

@Scope
annotation class AppScope