package com.web0zz.cryptochat.presentation.screen.home

import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.web0zz.cryptochat.R
import com.web0zz.cryptochat.databinding.FragmentHomeBinding
import com.web0zz.cryptochat.domain.model.Chat
import com.web0zz.cryptochat.presentation.MainActivity
import com.web0zz.cryptochat.presentation.adapter.chat.ChatRecyclerAdapter
import com.web0zz.cryptochat.presentation.base.BaseFragment

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

    override fun onCreateViewInvoke() {
        fragmentBinding.homeTopBar.userImageUrl = "https://images.unsplash.com/photo-1535713875002-d1d0cf377fde?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dXNlciUyMHByb2ZpbGV8ZW58MHx8MHx8&w=1000&q=80"

        fragmentBinding.homeTopBar.homeTopBarThemeModeImageButton.setOnClickListener {
            val isLight = setThemeMode()
            fragmentBinding.homeTopBar.homeTopBarThemeModeImageButton.setImageResource(
                if (isLight) R.drawable.ic_light_mode else R.drawable.ic_dark_mode
            )
        }
        initRecyclerviewItems()
    }

    private fun setThemeMode(): Boolean {
        var isLight: Boolean
        (requireActivity() as MainActivity).let {
            with(it.themeModePreferences) {
                isLight = this.getBoolean(getString(R.string.theme_mode), false)
                edit().run {
                    putBoolean(getString(R.string.theme_mode), !isLight)
                    apply()
                }
            }
            it.setThemeMode()
        }
        return isLight
    }
    
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