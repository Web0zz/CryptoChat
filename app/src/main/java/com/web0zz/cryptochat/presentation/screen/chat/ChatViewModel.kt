package com.web0zz.cryptochat.presentation.screen.chat

import com.web0zz.cryptochat.di.ChatRepositoryImpl
import com.web0zz.cryptochat.domain.model.Message
import com.web0zz.cryptochat.domain.repository.ChatRepository
import com.web0zz.cryptochat.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ChatViewModel @Inject constructor(
    @ChatRepositoryImpl
    private val chatRepository: ChatRepository
) : BaseViewModel() {
    fun getChatById(id: Int) = chatRepository.getChatById(id)
    fun addNewMessage(id: Int, message: Message, onFinish: () -> Unit) {
        chatRepository.addNewMessage(id, message, onFinish)
    }
}