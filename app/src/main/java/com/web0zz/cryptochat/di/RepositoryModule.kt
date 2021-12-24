package com.web0zz.cryptochat.di

import com.web0zz.cryptochat.data.repository.ChatRepositoryImp
import com.web0zz.cryptochat.domain.repository.ChatRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    @ChatRepositoryImpl
    fun bindChatRepository(chatRepositoryImp: ChatRepositoryImp): ChatRepository
}

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class ChatRepositoryImpl
