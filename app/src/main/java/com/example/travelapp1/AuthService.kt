package com.example.travelapp1

interface AuthService {
    @POST("login")
    suspend fun login(@Body credentials: LoginRequest): Response<AuthToken>
}


data class LoginRequest(val username: String, val password: String)


data class AuthToken(val token: String)


class UserRepository(private val authService: AuthService) {

    suspend fun login(username: String, password: String): AuthToken {
        val loginRequest = LoginRequest(username, password)
        val response = authService.login(loginRequest)

        if (response.isSuccessful) {
            return response.body()!!
        } else {

            throw Exception("Kullanıcı girişi başarısız: ${response.errorBody()}")
        }
    }
}


val authService = Retrofit.Builder()
    .baseUrl("https://your.api.base.url/") // API'nizin temel URL'si
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    .create(AuthService::class.java)

val userRepository = UserRepository(authService)
val authToken = userRepository.login("kullanici_adiniz", "sifreniz")

