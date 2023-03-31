package com.example.shoppingapp.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppingapp.LOG_INFO

class MainViewModel: ViewModel(){
    // for the data would not be changed easily make message as private.
    private val _message = MutableLiveData<String>()
    // can be observed but cannot be changes.
    val message:LiveData<String> = _message

    init {
        Log.i(LOG_INFO,"MainModel is CREATE");
    }

    fun loadMessage(){
        _message.value="Live Data"
        // if it will never be null use !!

    }
}