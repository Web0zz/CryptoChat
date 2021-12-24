package com.web0zz.cryptochat.presentation.adapter.chat.viewholder.chat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.web0zz.cryptochat.databinding.ViewHomeChatItemBinding
import com.web0zz.cryptochat.domain.model.Chat

class ChatViewHolder(
    private val binding: ViewHomeChatItemBinding,
    private val onClickChat: (Int) -> Unit
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(chat: Chat) {
        binding.root.setOnClickListener { onClickChat(chat.id) }
    }

    companion object {
        fun create(
            parent: ViewGroup,
            onClickChat: (Int) -> Unit
        ): ChatViewHolder {
            val view = ViewHomeChatItemBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)
            return ChatViewHolder(view, onClickChat)
        }
    }
}