package com.example.kotlin.Data

import android.util.Log
import com.example.kotlin.Data.DTO.ToDoList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {
    /**데이터베이스에 접근할 수 있는 곳*/
    private val Dr = DataResource
    fun getList(param: GetDataCallback<ToDoList>) {
        val call = Dr.service.getList() //api 호출

        /**비동기 통신: enqueue*/
        call.enqueue(object : Callback<ToDoList>{
            override fun onResponse(call: Call<ToDoList>, response: Response<ToDoList>) {
                /**응답 성공*/
                Log.i("response", response.body().toString()) //데이터 확인
                /**Viewmodel의 인터페이스 구현부에 데이터 넘겨주기*/
                param.onSuccess(response.body())
            }

            override fun onFailure(call: Call<ToDoList>, t: Throwable) {
                /**응답 실패*/
                param.onFailure(t)
            }
        })
    }

    /**서버응답 결과를 뷰모델로 넘겨줄 수 있는 인터페이스*/
    interface GetDataCallback<T>{
        fun onSuccess(data:T?)
        fun onFailure(throwable: Throwable)
    }
}