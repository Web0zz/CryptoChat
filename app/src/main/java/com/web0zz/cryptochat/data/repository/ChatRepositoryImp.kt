package com.web0zz.cryptochat.data.repository

import com.web0zz.cryptochat.data.ChatDataSource
import com.web0zz.cryptochat.domain.model.Chat
import com.web0zz.cryptochat.domain.model.Message
import com.web0zz.cryptochat.domain.repository.ChatRepository
import javax.inject.Inject

class ChatRepositoryImp @Inject constructor(
    private val chatDataSource: ChatDataSource
) : ChatRepository {
    override fun getChats(): List<Chat> {
        return chatDataSource.chatList
    }

    override fun getChatById(id: Int): Chat {
        return chatDataSource.chatList.first { it.id == id }
    }

    override fun addNewMessage(chatId: Int, message: Message, onFinish: () -> Unit) {
        chatDataSource.chatList.first { it.id == chatId }.messages.add(0, message)
        onFinish.invoke()
    }
}