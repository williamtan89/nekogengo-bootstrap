package com.nekogengo.login

import com.nekogengo.login_bridge.LoginBridge
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class LoginModule {
    @Binds
    abstract fun bindLoginBridge(impl: LoginBridgeImpl): LoginBridge
}