package com.davito.conversordemonedas.ui.splash

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davito.conversordemonedas.databinding.ActivitySplashBinding
import com.davito.conversordemonedas.ui.main.MainActivity
import java.util.Timer
import kotlin.concurrent.timerTask

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val timer = Timer()

        timer.schedule(
            timerTask {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }, 2000
        )

        binding = ActivitySplashBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}