package com.nekogengo.bootstrap.splash.di

import com.nekogengo.login_bridge.LoginBridge
import com.nekogengo.network_bridge.NetworkBridge
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface SplashDependencies {
    fun networkBridge(): NetworkBridge
    fun loginBridge(): LoginBridge
}