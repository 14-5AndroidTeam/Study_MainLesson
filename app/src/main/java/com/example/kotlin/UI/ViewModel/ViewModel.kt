package com.example.kotlin.UI.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlin.Data.DTO.ToDoList
import com.example.kotlin.Data.Repository
import com.example.kotlin.Event

class ViewModel:androidx.lifecycle.ViewModel() {

    val repo = Repository()

    private var _submit = MutableLiveData<Event<Boolean>>()
    val submit: LiveData<Event<Boolean>> = _submit

    fun postTodo(content: String, dueDate: String) {
        /**RetrofitObject.블라블라 <- 콜백함수*/
        /**콜백함수에서 받은 반환 값을 LiveData 형식의 변수에 할당*/
        _submit.postValue(Event(true))
    }

    fun getList(){
        repo.getList(object :Repository.GetDataCallback<ToDoList>{
            override fun onSuccess(data: ToDoList?) {
                /**응답받은 데이터 내용을 LiveData로 할당한다*/
            }

            override fun onFailure(throwable: Throwable) {
                /**throwable 매개변수를 가공을 해서 UI단에 에러메세지로 넘겨줄 수 있겠다....*/
            }
        })
    }
}