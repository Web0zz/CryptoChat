package com.web0zz.cryptochat.di

import com.web0zz.cryptochat.data.ChatDataSource
import com.web0zz.cryptochat.domain.model.Chat
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {
    @Singleton
    @Provides
    fun provideChatDataSource(): ChatDataSource = ChatDataSource()
}