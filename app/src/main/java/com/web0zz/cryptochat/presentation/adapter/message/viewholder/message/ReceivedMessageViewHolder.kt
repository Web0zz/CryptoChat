package com.web0zz.cryptochat.presentation.adapter.message.viewholder.message

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.web0zz.cryptochat.databinding.ViewMessageItemReceivedBinding
import com.web0zz.cryptochat.presentation.adapter.message.model.ReceivedMessage

class ReceivedMessageViewHolder(
    private val binding: ViewMessageItemReceivedBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(receivedMessage: ReceivedMessage) {
        var isClicked = false

        binding.message = receivedMessage.message
        binding.receivedMessageMaterialCardView.setOnClickListener {
            isClicked = if (isClicked) {
                binding.receivedMessageMotionLayout.transitionToStart()
                false
            } else {
                binding.receivedMessageMotionLayout.transitionToEnd()
                true
            }
        }
    }

    companion object {
        fun create(
            parent: ViewGroup
        ): ReceivedMessageViewHolder {
            val view = ViewMessageItemReceivedBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)
            return ReceivedMessageViewHolder(view)
        }
    }
}