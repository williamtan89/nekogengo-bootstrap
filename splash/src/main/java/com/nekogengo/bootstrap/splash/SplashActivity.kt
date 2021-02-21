package com.nekogengo.bootstrap.splash

import android.os.Bundle
import com.nekogengo.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SplashActivity: BaseActivity() {
    @Inject lateinit var splashInteractor: SplashInteractor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        splashInteractor.init()
    }
}