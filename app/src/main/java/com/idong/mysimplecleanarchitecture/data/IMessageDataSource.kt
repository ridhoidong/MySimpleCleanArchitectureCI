package com.idong.mysimplecleanarchitecture.data

import com.idong.mysimplecleanarchitecture.domain.MessageEntity

/**
 * Created by ridhopratama on 19,August,2021
 */
interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}