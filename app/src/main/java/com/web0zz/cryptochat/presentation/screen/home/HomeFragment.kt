package com.web0zz.cryptochat.presentation.screen.home

import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.web0zz.cryptochat.R
import com.web0zz.cryptochat.databinding.FragmentHomeBinding
import com.web0zz.cryptochat.domain.model.Chat
import com.web0zz.cryptochat.presentation.adapter.chat.ChatRecyclerAdapter
import com.web0zz.cryptochat.presentation.base.BaseFragment
import com.web0zz.cryptochat.presentation.screen.chat.ChatFragment

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate
) {
    override val mViewModel: HomeViewModel by viewModels()
    private val navController by lazy {
        activity?.let {
            return@let Navigation.findNavController(it, R.id.nav_host_fragmentContainerView)
        }
    }

    private val chatData = listOf<Chat>() // TODO take data from room

    override fun onCreateViewInvoke() = initRecyclerviewItems()

    private fun initRecyclerviewItems() {
        fragmentBinding.chatListRecyclerView.apply {
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = ChatRecyclerAdapter(chatData, ::toMessageScreen)
        }
    }

    private fun toMessageScreen(chatId: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToChatFragment(chatId)
        navController?.navigate(action)
    }
}