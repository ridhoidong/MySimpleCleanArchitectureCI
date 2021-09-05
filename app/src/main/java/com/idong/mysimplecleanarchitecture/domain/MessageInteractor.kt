package com.idong.mysimplecleanarchitecture.domain

/**
 * Created by ridhopratama on 19,August,2021
 */
class MessageInteractor(private val messageRepository: IMessageRepository) : MessageUseCase {
    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }
}