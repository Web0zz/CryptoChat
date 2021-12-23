package com.web0zz.cryptochat.presentation.screen.home

import androidx.fragment.app.viewModels
import com.web0zz.cryptochat.databinding.FragmentHomeBinding
import com.web0zz.cryptochat.presentation.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate
) {
    override val mViewModel: HomeViewModel by viewModels()
}