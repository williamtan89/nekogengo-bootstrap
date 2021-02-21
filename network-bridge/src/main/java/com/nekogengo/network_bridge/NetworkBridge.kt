package com.nekogengo.network_bridge

import retrofit2.Retrofit

interface NetworkBridge {
    fun retrofit(): Retrofit
}