package com.idong.mysimplecleanarchitecture.domain

/**
 * Created by ridhopratama on 19,August,2021
 */
interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}