package com.nekogengo.login

import android.app.Activity
import com.nekogengo.login_bridge.LoginBridge
import javax.inject.Inject

class LoginBridgeImpl @Inject constructor(
    private val activity: Activity
): LoginBridge {
    override fun start() {
        LoginActivity.start(activity = activity)
    }
}