package com.example.netappmoshi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.JsonReader
import android.util.Log
import com.example.netappmoshi.api.RetrofitClient.apiService
import com.example.netappmoshi.model.User
import com.example.netappmoshi.model.UsersResponse
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userShow()


    }

      private  fun userShow(){



            val api = apiService.userData()
                .enqueue(object :Callback<UsersResponse>{
                    override fun onResponse(call: Call<UsersResponse>, response: Response<UsersResponse>) {

                        val usersResponse = response.body()




                       

                        val gson = GsonBuilder().setPrettyPrinting().create()
                        Log.e("MainActivity", gson.toJson(usersResponse))


                    }

                    override fun onFailure(call: Call<UsersResponse>, t: Throwable) {

                    }

                })

    }
}