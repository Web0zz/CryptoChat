package com.web0zz.cryptochat.presentation.adapter.chat.viewholder.chat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.web0zz.cryptochat.databinding.ViewChatItemBinding
import com.web0zz.cryptochat.domain.model.Chat

class ChatViewHolder(
    private val binding: ViewChatItemBinding,
    private val onClickChat: (Chat) -> Unit
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(chat: Chat) {
        binding.root.setOnClickListener { onClickChat(chat) }
    }

    companion object {
        fun create(
            parent: ViewGroup,
            onClickChat: (Chat) -> Unit
        ): ChatViewHolder {
            val view = ViewChatItemBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)
            return ChatViewHolder(view, onClickChat)
        }
    }
}