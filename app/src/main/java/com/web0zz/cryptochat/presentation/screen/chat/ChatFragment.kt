package com.web0zz.cryptochat.presentation.screen.chat

import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.web0zz.cryptochat.R
import com.web0zz.cryptochat.databinding.FragmentChatBinding
import com.web0zz.cryptochat.domain.model.Chat
import com.web0zz.cryptochat.domain.model.Message
import com.web0zz.cryptochat.presentation.adapter.message.MessageRecyclerAdapter
import com.web0zz.cryptochat.presentation.adapter.message.model.MessageItem
import com.web0zz.cryptochat.presentation.adapter.message.model.ReceivedMessage
import com.web0zz.cryptochat.presentation.adapter.message.model.SentMessage
import com.web0zz.cryptochat.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ChatFragment : BaseFragment<FragmentChatBinding, ChatViewModel>(
    FragmentChatBinding::inflate
) {
    private val navController by lazy {
        activity?.let {
            return@let Navigation.findNavController(it, R.id.nav_host_fragmentContainerView)
        }
    }
    override val mViewModel: ChatViewModel by viewModels()
    private val safeArgs: ChatFragmentArgs by navArgs()

    private val chat: Chat by lazy { mViewModel.getChatById(safeArgs.chatId) }
    private val messageList: MutableList<MessageItem> = mutableListOf()

    private lateinit var messageRecyclerAdapter: MessageRecyclerAdapter

    override fun onCreateInvoke() {
        chat.messages.forEach {
            if (it.fromUser) messageList.add(SentMessage(it))
            else messageList.add(ReceivedMessage(it))
        }
    }

    override fun onCreateViewInvoke() {
        with(fragmentBinding.chatTopBar) {
            userImageUrl = chat.imageUrl
            userTitle = chat.title

            chatTopBarBackImageButton.setOnClickListener {
                navController?.popBackStack()
            }
        }

        with(fragmentBinding.messagesRecyclerView) {
            layoutManager =
                LinearLayoutManager(
                    context,
                    LinearLayoutManager.VERTICAL,
                    false
                ).apply { stackFromEnd = true }
            adapter = MessageRecyclerAdapter(messageList).also { messageRecyclerAdapter = it }
        }

        fragmentBinding.messageSendFloatingActionButton.setOnClickListener {
            fragmentBinding.messageInputTextInputLayout.editText?.text?.let { messageBody ->
                if (messageBody.isNotBlank() && messageBody.isNotEmpty()) {
                    val sendMessage: Message
                    mViewModel.addNewMessage(
                        chat.id,
                        Message(
                            0,
                            messageBody.toString(),
                            "TODAY",
                            isRead = true,
                            fromUser = true
                        ).also { sendMessage = it }
                    ) {
                        messageRecyclerAdapter.addNewMessage(SentMessage(sendMessage))
                        fragmentBinding.messageInputTextInputLayout.editText?.text?.clear()
                    }
                }
            }
        }
    }
}