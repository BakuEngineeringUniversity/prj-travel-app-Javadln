package com.example.travelapp1.api

interface ApiService {

    @POST("/api/login")
    suspend fun loginUser(@Body request: LoginRequest): Response<LoginResponse>
}
