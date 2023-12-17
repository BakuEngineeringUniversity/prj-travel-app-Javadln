package com.example.travelapp1.api

object ApiClient {

    private val retrofit = Retrofit.Builder()
        //.baseUrl("http://your-api-url/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: ApiService = retrofit.create(ApiService::class.java)
}
