package com.idong.mysimplecleanarchitecture.di

import com.idong.mysimplecleanarchitecture.data.IMessageDataSource
import com.idong.mysimplecleanarchitecture.data.MessageDataSource
import com.idong.mysimplecleanarchitecture.data.MessageRepository
import com.idong.mysimplecleanarchitecture.domain.IMessageRepository
import com.idong.mysimplecleanarchitecture.domain.MessageInteractor
import com.idong.mysimplecleanarchitecture.domain.MessageUseCase

/**
 * Created by ridhopratama on 19,August,2021
 */
object Injection {

    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }

}