package com.example.kotlin.data

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DataResource {
    val baseUrl = "https://todolist-369816.df.r.appspot.com"

    var gson = GsonBuilder().setLenient().create()
    val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()
    val service = retrofit.create(Service::class.java)
}