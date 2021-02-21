package com.nekogengo.network

import com.nekogengo.network_bridge.NetworkBridge
import retrofit2.Retrofit
import javax.inject.Inject

const val BASE_URL = "https://nekogengo.com/"

class NetworkBridgeImpl @Inject constructor(): NetworkBridge {
    override fun retrofit(): Retrofit = Retrofit.Builder().baseUrl(BASE_URL).build()
}