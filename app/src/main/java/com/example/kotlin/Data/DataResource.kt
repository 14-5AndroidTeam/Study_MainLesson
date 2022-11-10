package com.example.kotlin.Data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DataResource {
    val baseUrl = "https://"
    val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    val service = retrofit.create(Service::class.java);
}