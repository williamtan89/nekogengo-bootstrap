package com.nekogengo.bootstrap.splash.di

import com.nekogengo.bootstrap.splash.SplashApi
import com.nekogengo.bootstrap.splash.SplashInteractor
import com.nekogengo.bootstrap.splash.SplashRepository
import com.nekogengo.login_bridge.LoginBridge
import com.nekogengo.network_bridge.NetworkBridge
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object SplashModule {
    @Provides
    fun provideSplashApi(
        networkBridge: NetworkBridge
    ): SplashApi = networkBridge.retrofit().create(SplashApi::class.java)

    @Provides
    fun provideSplashRepository(
        splashApi: SplashApi
    ): SplashRepository = SplashRepository(splashApi)

    @Provides
    fun provideSplashInteractor(
        loginBridge: LoginBridge,
        splashRepository: SplashRepository
    ): SplashInteractor = SplashInteractor(
        loginBridge,
        splashRepository
    )
}