package com.example.netappmoshi.model

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)

 class UsersResponse(
    @Json(name = "error")

    val error: Boolean,

   @Json(name ="users")
    val user: List<User>
)

