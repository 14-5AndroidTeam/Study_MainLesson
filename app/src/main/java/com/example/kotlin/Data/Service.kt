package com.example.kotlin.Data

import com.example.kotlin.Data.DTO.ToDoList
import retrofit2.Call
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface Service {
    /**GET, POST 등의 API 정의하기*/
    @GET("/todos") //todolist 불러오는 api
    fun getList(): Call<ToDoList>
}