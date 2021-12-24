package com.web0zz.cryptochat.presentation.screen.home

import androidx.core.content.ContextCompat
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.web0zz.cryptochat.R
import com.web0zz.cryptochat.data.ChatDataSource
import com.web0zz.cryptochat.databinding.FragmentHomeBinding
import com.web0zz.cryptochat.presentation.MainActivity
import com.web0zz.cryptochat.presentation.adapter.chat.ChatRecyclerAdapter
import com.web0zz.cryptochat.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate
) {
    override val mViewModel: HomeViewModel by viewModels()
    private val navController by lazy {
        activity?.let {
            return@let Navigation.findNavController(it, R.id.nav_host_fragmentContainerView)
        }
    }

    private val chatData by lazy {
        mViewModel.getChats()
    }

    override fun onCreateViewInvoke() {
        fragmentBinding.homeTopBar.userImageUrl = "https://images.unsplash.com/photo-1535713875002-d1d0cf377fde?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dXNlciUyMHByb2ZpbGV8ZW58MHx8MHx8&w=1000&q=80"

        fragmentBinding.homeTopBar.homeTopBarThemeModeImageButton.setImageResource(
            with((requireActivity() as MainActivity).themeModePreferences) {
                if (this.getBoolean(getString(R.string.theme_mode), true)) R.drawable.ic_light_mode
                else R.drawable.ic_dark_mode
            }
        )

        fragmentBinding.homeTopBar.homeTopBarThemeModeImageButton.setOnClickListener {
            setThemeMode()
        }
        initRecyclerviewItems()
    }

    private fun setThemeMode(): Boolean {
        var isLight: Boolean
        (requireActivity() as MainActivity).let {
            with(it.themeModePreferences) {
                isLight = this.getBoolean(getString(R.string.theme_mode), true)
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
        val divider = DividerItemDecoration(context, DividerItemDecoration.VERTICAL).apply {
            ContextCompat.getDrawable(fragmentBinding.root.context, R.drawable.line_divider)
                ?.let { setDrawable(it) }
        }

        with(fragmentBinding.chatListRecyclerView) {
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = ChatRecyclerAdapter(chatData, ::toMessageScreen)
            addItemDecoration(divider)
        }
    }

    private fun toMessageScreen(chatId: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToChatFragment(chatId)
        navController?.navigate(action)
    }
}