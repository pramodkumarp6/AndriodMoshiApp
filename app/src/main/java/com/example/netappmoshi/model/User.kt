package com.example.netappmoshi.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)


data class User(
    @Json(name = "email")
    var email: String,
    @Json(name = "id")
    var id: String,
    @Json(name = "name")
    var name: String,
    @Json(name = "school")
    var school: String
)



/*
data class User(

    var email: String,

    var id: String,

    var name: String,

    var school: String
)
*/
