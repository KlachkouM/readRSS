package com.app.rsfsreader.Model

data class RSSObject(
    val status: String,
    val feed: Feed,
    val items: List<Item>
)