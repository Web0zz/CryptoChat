package com.web0zz.cryptochat.domain.model

data class Message(
    val id: Int,
    val body: String,
    val sendTime: String,
    var isRead: Boolean = true,
    val fromUser: Boolean = false
)