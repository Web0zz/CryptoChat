package com.web0zz.cryptochat.presentation.screen.chat

import androidx.fragment.app.viewModels
import com.web0zz.cryptochat.databinding.FragmentChatBinding
import com.web0zz.cryptochat.presentation.base.BaseFragment

class ChatFragment : BaseFragment<FragmentChatBinding, ChatViewModel>(
    FragmentChatBinding::inflate
) {
    override val mViewModel: ChatViewModel by viewModels()
}