package com.example.shoppingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.shoppingapp.databinding.ActivityMainBinding
import com.example.shoppingapp.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Implementing Lifecycle. Lifecycle aware
        // Apply Best practices.
        lifecycle.addObserver(MyObserver())
        val viewModel by viewModels<MainViewModel> ()
        viewModel.loadMessage()
            //restoring data bitmaps/images.
        viewModel.message.observe(this){
            binding.txtQty.text = it
        }

    }
}