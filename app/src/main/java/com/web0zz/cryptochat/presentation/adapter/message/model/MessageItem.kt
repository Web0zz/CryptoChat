package com.web0zz.cryptochat.presentation.adapter.message.model

interface MessageItem {
    fun getType(): Int

    enum class Type {
        RECEIVED_MESSAGE,
        SENT_MESSAGE
    }
}