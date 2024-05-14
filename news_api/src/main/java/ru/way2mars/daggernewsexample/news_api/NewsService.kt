package ru.way2mars.daggernewsexample.news_api

import retrofit2.http.GET

interface NewsService {

    @GET("/v2/top-headlines")
    fun topHeadlines(apiKey: String): Articles
}