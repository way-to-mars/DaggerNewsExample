package ru.way2mars.daggernewsexample

import dagger.Component
import dagger.Module
import ru.way2mars.daggernewsexample.news_api.NewsService
import javax.inject.Scope

@[NewsDetailsScope Component(
    dependencies = [NewsDetailsDeps::class],
    modules = [NewsDetailsModule::class]
)]
interface NewsDetailsComponent {}

@Module
internal class NewsDetailsModule

interface NewsDetailsDeps {
    val newsService: NewsService
}

@Scope
annotation class NewsDetailsScope