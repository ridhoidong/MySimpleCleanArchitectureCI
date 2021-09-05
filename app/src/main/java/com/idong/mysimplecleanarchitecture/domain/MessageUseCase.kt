package com.idong.mysimplecleanarchitecture.domain

/**
 * Created by ridhopratama on 19,August,2021
 */
interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}