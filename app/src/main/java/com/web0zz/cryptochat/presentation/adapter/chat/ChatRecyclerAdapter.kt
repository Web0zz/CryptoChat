package com.web0zz.cryptochat.presentation.adapter.chat

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.web0zz.cryptochat.domain.model.Chat
import com.web0zz.cryptochat.presentation.adapter.chat.viewholder.chat.ChatViewHolder

class ChatRecyclerAdapter(
    private val chatList: List<Chat>,
    private val onClickChat: (Chat) -> Unit
) : RecyclerView.Adapter<ChatViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        return ChatViewHolder.create(parent, onClickChat)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bind(chatList[position])
    }

    override fun getItemCount(): Int = chatList.size
}