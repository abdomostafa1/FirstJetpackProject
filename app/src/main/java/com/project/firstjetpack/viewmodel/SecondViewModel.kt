package com.project.firstjetpack.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SecondViewModel:ViewModel() {

    private val _counter= MutableStateFlow(0)
    val counter=_counter.asStateFlow()

    fun increaseCounter(){
        _counter.update {
            it+1
        }
    }

    fun decreaseCounter(){
        _counter.update {
            it-1
        }
    }
}