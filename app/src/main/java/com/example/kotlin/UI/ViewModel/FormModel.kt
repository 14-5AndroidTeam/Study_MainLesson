package com.example.kotlin.UI.ViewModel

import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlin.Data.DTO.Form
import com.example.kotlin.Data.Repository
import com.example.kotlin.Event

class FormModel:androidx.lifecycle.ViewModel(){

    val repo = Repository()
    private var _submit = MutableLiveData<Event<Boolean>>()
    val submit: LiveData<Event<Boolean>> = _submit

    fun postForm(content: String, deadline: String) {
        var form = Form(
            content = content,
            deadline = deadline
        )
        repo.postForm(form)
        /**콜백함수에서 받은 반환 값을 LiveData 형식의 변수에 할당*/
        _submit.postValue(Event(true))
    }
}