package com.example.shoppingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shoppingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Implementing Lifecycle. Lifecycle aware
        // Apply Best practices.
        lifecycle.addObserver(MyObserver())
        //https://youtu.be/dMYmZUgncVM?t=471
    }
}