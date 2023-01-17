package com.example.kotlin.util.coroutine

import android.util.Log
import kotlinx.coroutines.*

class ExampleScope {
    fun makeBasic(){
        val parentJob = Job()
        val handler = CoroutineExceptionHandler { coroutineContext, throwable ->
            Log.i("Caught ", throwable.toString())
        }
        //CoroutineScope
        val coroutineScope = kotlinx.coroutines.CoroutineScope(Dispatchers.IO)
        //Use
        val job = coroutineScope.launch {
            //Body of coroutine
        }
    }

    fun cancelFirstJob() {

    }
}