package com.example.kotlin.Data.DTO

import com.google.gson.annotations.SerializedName

/**DTO: Java객체를 Json객체로 직렬화(Serialize)*/
data class ToDoList(
    @SerializedName("id")
    var id:Int,
    @SerializedName("content:")
    var content:String,
    @SerializedName("dueDate:")
    var dueDate:String
)
