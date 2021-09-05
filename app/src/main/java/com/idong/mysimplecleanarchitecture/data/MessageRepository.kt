package com.idong.mysimplecleanarchitecture.data

import com.idong.mysimplecleanarchitecture.domain.IMessageRepository
import com.idong.mysimplecleanarchitecture.domain.MessageEntity

/**
 * Created by ridhopratama on 19,August,2021
 */
class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {

    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)

}