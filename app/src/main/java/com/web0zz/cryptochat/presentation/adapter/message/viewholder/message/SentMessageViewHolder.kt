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
        var isClicked = false

        binding.message = sentMessage.message
        binding.sentMessageMaterialCardView.setOnClickListener {
            isClicked = if (isClicked) {
                binding.sentMessageMotionLayout.transitionToStart()
                false
            } else {
                binding.sentMessageMotionLayout.transitionToEnd()
                true
            }
        }
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