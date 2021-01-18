package com.androidstrike.javit.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidstrike.javit.R

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val fragment = SignIn()
        supportFragmentManager.beginTransaction()
            .replace(R.id.auth_frame, fragment, fragment.javaClass.simpleName)
            .commit()

    }
}