package com.nekogengo.network

import com.nekogengo.network_bridge.NetworkBridge
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class NetworkBridgeModule {
    @Provides
    fun provideNetworkBridge(): NetworkBridge = NetworkBridgeImpl()
}