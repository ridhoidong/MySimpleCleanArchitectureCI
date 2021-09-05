package com.idong.mysimplecleanarchitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.idong.mysimplecleanarchitecture.domain.MessageEntity
import com.idong.mysimplecleanarchitecture.domain.MessageUseCase

/**
 * Created by ridhopratama on 19,August,2021
 */
class MainViewModel(private val messageUseCase: MessageUseCase) : ViewModel() {

    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity>
        get() = _message

    fun setName(name: String) {
        _message.value = messageUseCase.getMessage(name)
    }

}