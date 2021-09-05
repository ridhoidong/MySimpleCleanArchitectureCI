package com.idong.mysimplecleanarchitecture.data

import com.idong.mysimplecleanarchitecture.domain.MessageEntity

/**
 * Created by ridhopratama on 19,August,2021
 */
class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity = MessageEntity("Hello $name! Welcome to Clean Architecture")
}