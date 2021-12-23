package com.web0zz.cryptochat.presentation.screen.home

import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.web0zz.cryptochat.R
import com.web0zz.cryptochat.databinding.FragmentHomeBinding
import com.web0zz.cryptochat.presentation.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate
) {
    override val mViewModel: HomeViewModel by viewModels()
    val navController by lazy {
        activity?.let {
            return@let Navigation.findNavController(it, R.id.nav_host_fragmentContainerView)
        }
    }

    private fun initRecyclerviewItems() {
        fragmentBinding.chatListRecyclerView.apply {
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        }
    }
}