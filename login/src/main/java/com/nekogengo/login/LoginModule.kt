package com.nekogengo.login

import android.content.Context
import com.nekogengo.login_bridge.LoginBridge
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class LoginModule {
    @Provides
    fun provideLoginBridge(
        @ApplicationContext appContext: Context
    ): LoginBridge = LoginBridgeImpl(appContext)
}