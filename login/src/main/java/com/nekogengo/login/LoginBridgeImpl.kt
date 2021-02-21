package com.nekogengo.login

import android.content.Context
import com.nekogengo.login_bridge.LoginBridge
import javax.inject.Inject

class LoginBridgeImpl @Inject constructor(
    private val context: Context
): LoginBridge {
    override fun start() {
        LoginActivity.start(context)
    }
}