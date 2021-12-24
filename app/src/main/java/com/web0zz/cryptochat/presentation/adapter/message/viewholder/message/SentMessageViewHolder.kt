package com.web0zz.cryptochat.presentation.adapter.message.viewholder.message

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.web0zz.cryptochat.databinding.ViewMessageItemSentBinding
import com.web0zz.cryptochat.presentation.adapter.message.model.SentMessage

class SentMessageViewHolder(
    private val binding: ViewMessageItemSentBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(sentMessage: SentMessage) {
        binding.message = sentMessage.message
    }

    companion object {
        fun create(
            parent: ViewGroup
        ): SentMessageViewHolder {
            val view = ViewMessageItemSentBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)
            return SentMessageViewHolder(view)
        }
    }
}