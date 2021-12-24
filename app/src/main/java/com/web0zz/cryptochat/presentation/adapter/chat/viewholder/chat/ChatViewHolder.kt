package com.web0zz.cryptochat.presentation.adapter.chat.viewholder.chat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.web0zz.cryptochat.R
import com.web0zz.cryptochat.databinding.ViewHomeChatItemBinding
import com.web0zz.cryptochat.domain.model.Chat

class ChatViewHolder(
    private val binding: ViewHomeChatItemBinding,
    private val onClickChat: (Int) -> Unit
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(chat: Chat) {
        binding.chat = chat
        binding.root.setOnClickListener { onClickChat(chat.id) }

        binding.chatItemUserLastMessageTextView.text = chat.messages.last().body
        binding.chatItemLastMessageTimeTextView.text = chat.messages.last().sendTime

        var unReadCount = 0
        for (item in chat.messages.reversed()) {
            if (!item.isRead) unReadCount++
            else break
        }

        if (unReadCount > 0) {
            binding.chatItemUserLastMessageTextView.text = chat.messages.last().body
            binding.chatItemUserLastMessageTextView.setTextColor(ContextCompat.getColor(binding.root.context, R.color.light_blue))
            binding.chatItemLastMessageCountTextView.text = unReadCount.toString()
            binding.chatItemLastMessageCountTextView.visibility = View.VISIBLE
        }
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