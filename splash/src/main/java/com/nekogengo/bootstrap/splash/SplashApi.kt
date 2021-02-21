package com.nekogengo.bootstrap.splash

import retrofit2.Response
import retrofit2.http.GET

interface SplashApi {
    @GET("test")
    suspend fun test(): Response<Boolean>
}