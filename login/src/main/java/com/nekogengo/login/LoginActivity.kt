package com.nekogengo.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.nekogengo.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity: BaseActivity() {
    companion object {
        fun start(
            context: Context
        ) {
            context.startActivity(
                Intent(context, LoginActivity::class.java).also {
                    it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
    }
}