package com.example.netappmoshi.api

import com.example.netappmoshi.model.UsersResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface Api {

  //  @Headers("Content-Type: application/json")
    @GET("/simple/public/allusers")
    fun userData(): Call<UsersResponse>

}