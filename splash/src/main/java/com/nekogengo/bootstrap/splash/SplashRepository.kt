package com.nekogengo.bootstrap.splash

import javax.inject.Inject

class SplashRepository @Inject constructor(
    private val splashApi: SplashApi
) {
    suspend fun test(): Boolean {
//        val response = splashApi.test()

        return true
    }
}