package com.web0zz.cryptochat.domain.repository

import com.web0zz.cryptochat.domain.model.Chat
import com.web0zz.cryptochat.domain.model.Message

interface ChatRepository {
    fun getChats(): List<Chat>
    fun getChatById(id: Int): Chat
    fun addNewMessage(chatId: Int, message: Message, onFinish: () -> Unit)
}