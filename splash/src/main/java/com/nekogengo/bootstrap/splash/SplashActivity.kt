package com.nekogengo.bootstrap.splash

import android.os.Bundle
import com.nekogengo.base.BaseActivity
import com.nekogengo.login_bridge.LoginBridge
import dagger.hilt.android.AndroidEntryPoint
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@AndroidEntryPoint
class SplashActivity: BaseActivity() {
    @Inject lateinit var loginBridge: LoginBridge

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Executors.newSingleThreadScheduledExecutor().schedule({
            loginBridge.start()
        }, 2, TimeUnit.SECONDS)
    }
}