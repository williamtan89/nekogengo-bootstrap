package com.nekogengo.login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.nekogengo.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity: BaseActivity() {
    companion object {
        fun start(
            activity: Activity
        ) {
            activity.startActivity(
                Intent(activity, LoginActivity::class.java)
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
    }
}