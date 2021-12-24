package com.web0zz.cryptochat.presentation.screen.home

import com.web0zz.cryptochat.di.ChatRepositoryImpl
import com.web0zz.cryptochat.domain.repository.ChatRepository
import com.web0zz.cryptochat.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    @ChatRepositoryImpl
    private val chatRepository: ChatRepository
) : BaseViewModel() {
    fun getChats() = chatRepository.getChats()
}