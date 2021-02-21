package com.nekogengo.bootstrap.splash

import com.nekogengo.login_bridge.LoginBridge
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class SplashInteractor @Inject constructor(
    private val loginBridge: LoginBridge,
    private val splashRepository: SplashRepository
) {
    fun init() {
        println("testing init ")

        GlobalScope.launch(Dispatchers.Main) {
            val result = splashRepository.test()

            println("result is $result")

            loginBridge.start()
        }
    }
}