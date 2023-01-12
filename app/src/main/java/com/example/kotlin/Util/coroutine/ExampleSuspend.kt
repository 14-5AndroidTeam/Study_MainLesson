package com.example.kotlin.Util.coroutine

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async

/**coroutine suspend가 헷갈려서 만든 클래스 예제*/
class ExampleSuspend {
    fun main() {
        val coroutineScope = CoroutineScope(Dispatchers.IO)
        coroutineScope.async {}
    }

    fun nonSuspendTask1() {
        Thread.sleep(3000)
        Log.d("ExampleSuspend", "[nonSuspendTask1] After 3s in (${Thread.currentThread().name})")
        Thread.sleep(3000)
        Log.d("ExampleSuspend", "[nonSuspendTask1] After 3s in (${Thread.currentThread().name})")

        Log.d("ExampleSuspend", "[nonSuspendTask1] END 3s in (${Thread.currentThread().name})*****")
    }
}