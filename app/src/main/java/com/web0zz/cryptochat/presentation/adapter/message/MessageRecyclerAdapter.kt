package com.web0zz.cryptochat.presentation.adapter.message

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.web0zz.cryptochat.presentation.adapter.message.model.MessageItem
import com.web0zz.cryptochat.presentation.adapter.message.model.MessageItem.Type.RECEIVED_MESSAGE
import com.web0zz.cryptochat.presentation.adapter.message.model.MessageItem.Type.SENT_MESSAGE
import com.web0zz.cryptochat.presentation.adapter.message.model.ReceivedMessage
import com.web0zz.cryptochat.presentation.adapter.message.model.SentMessage
import com.web0zz.cryptochat.presentation.adapter.message.viewholder.message.ReceivedMessageViewHolder
import com.web0zz.cryptochat.presentation.adapter.message.viewholder.message.SentMessageViewHolder

class MessageRecyclerAdapter(
    private val items: MutableList<MessageItem>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemViewType(position: Int) = items[position].getType()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            RECEIVED_MESSAGE.ordinal -> ReceivedMessageViewHolder.create(parent)
            SENT_MESSAGE.ordinal -> SentMessageViewHolder.create(parent)
            else -> throw Exception("Unknown view type exception")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ReceivedMessageViewHolder -> holder.bind(items[position] as ReceivedMessage)
            is SentMessageViewHolder -> holder.bind(items[position] as SentMessage)
            else -> throw Exception("Unknown view type exception")
        }
    }

    override fun getItemCount() = items.size

    fun addNewMessage(message: SentMessage) {
        items.add(message)
        notifyItemInserted(items.size - 1)
    }
}