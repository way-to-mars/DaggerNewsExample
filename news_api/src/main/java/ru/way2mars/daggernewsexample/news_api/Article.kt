package ru.way2mars.daggernewsexample.news_api

import java.util.Date

data class Articles(
    val articles: List<Article>
)

data class Article(
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String?,
    val publishedAt: Date,
    val content: String,
)