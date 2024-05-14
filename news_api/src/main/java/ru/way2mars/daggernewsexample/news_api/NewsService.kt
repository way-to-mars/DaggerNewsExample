package ru.way2mars.daggernewsexample.news_api

import retrofit2.http.GET

interface NewsService {

    @GET("/v2/everything")
    fun everything(apiKey: String): Articles
}