package com.web0zz.cryptochat.domain.repository

import com.web0zz.cryptochat.domain.model.Chat

interface ChatRepository {
    fun getChats(): List<Chat>
}