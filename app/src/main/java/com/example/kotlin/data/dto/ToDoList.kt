package com.example.kotlin.data.dto

import com.google.gson.annotations.SerializedName

/**DTO: Java객체를 Json객체로 직렬화(Serialize)*/
data class ToDoList(
    @SerializedName("todos")
    var todos:List<Todos>,
    @SerializedName("total_post")
    var total_post:Int,
)
