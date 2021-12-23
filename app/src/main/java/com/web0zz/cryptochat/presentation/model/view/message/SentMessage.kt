package com.web0zz.cryptochat.presentation.model.view.message

import com.web0zz.cryptochat.domain.model.Message

data class SentMessage(
    val message: Message
) : MessageItem {
    override fun getType() = MessageItem.Type.SENT_MESSAGE.ordinal
}