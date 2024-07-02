package com.example.permissions_2_topshiriq

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.permissions_2_topshiriq.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val SplashTimeOut: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstFragment = FirstFragment()
        val supportFragmentManager = supportFragmentManager
        val beginTransaction = supportFragmentManager.beginTransaction()
        Handler(Looper.getMainLooper()).postDelayed({
            beginTransaction.add(R.id.container,firstFragment)
            beginTransaction.commit()
        },SplashTimeOut)
    }
}