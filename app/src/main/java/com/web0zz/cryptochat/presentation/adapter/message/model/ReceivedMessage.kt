package com.web0zz.cryptochat.presentation.adapter.message.model

import com.web0zz.cryptochat.domain.model.Message

class ReceivedMessage(
    val message: Message
) : MessageItem {
    override fun getType() = MessageItem.Type.RECEIVED_MESSAGE.ordinal
}