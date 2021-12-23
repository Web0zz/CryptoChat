package com.web0zz.cryptochat.presentation.model.view.message

interface MessageItem {
    fun getType(): Int

    enum class Type {
        RECEIVED_MESSAGE,
        SENT_MESSAGE
    }
}