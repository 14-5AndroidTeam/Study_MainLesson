package com.example.kotlin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ViewModel:androidx.lifecycle.ViewModel(){

    private var _submit = MutableLiveData<Event<Boolean>>()
    val submit: LiveData<Event<Boolean>> = _submit

    fun postTodo(content:String, dueDate:String){
        /**RetrofitObject.블라블라 <- 콜백함수*/
        /**콜백함수에서 받은 반환 값을 LiveData 형식의 변수에 할당*/
        _submit.postValue(Event(true))
}