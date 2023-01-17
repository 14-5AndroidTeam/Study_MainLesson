package com.example.kotlin.data

import com.example.kotlin.data.dto.Form
import com.example.kotlin.data.dto.ToDoList
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface Service {
    /**GET, POST 등의 API 정의하기*/
    @GET("/todos") //todolist 불러오는 api
    fun getList(): Call<ToDoList>

    @POST("/todos")
    fun postForm(
        @Body form: Form
    ):Call<String>

}