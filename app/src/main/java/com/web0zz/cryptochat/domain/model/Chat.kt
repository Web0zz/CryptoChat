package com.web0zz.cryptochat.domain.model

data class Chat(
    val id: Int,
    val imageUrl: String,
    val title: String,
    val messages: List<Message>
)