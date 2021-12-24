package com.web0zz.cryptochat.presentation.adapter.message.model

import com.web0zz.cryptochat.domain.model.Message

data class SentMessage(
    val message: Message
) : MessageItem {
    override fun getType() = MessageItem.Type.SENT_MESSAGE.ordinal
}