package com.example.netappmoshi.api

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitClient {
    public const val BASE_URL = "https://big-name-interviewe.000webhostapp.com"
    val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())

        .build()

    private  val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
       // .addConverterFactory(GsonConverterFactory.create())
       // .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()

    val apiService:Api by lazy {
        retrofit.create(Api::class.java)
    }


}