package com.graymandev.mvvmfoundation.view

import android.util.Log
import androidx.lifecycle.ViewModel

class ButtonControlsViewModel : ViewModel() {
    fun printText(s: String) {
        Log.i("VIEWMODEL", "IT WORKS")
        println(s)
    }
}