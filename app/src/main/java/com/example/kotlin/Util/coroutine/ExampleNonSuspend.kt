package com.example.kotlin.Util.coroutine

import android.content.ContentValues.TAG
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

/**coroutine suspend가 헷갈려서 만든 클래스 예제*/
class ExampleNonSuspend {
    fun main() {
        val coroutineScope = CoroutineScope(Dispatchers.IO)
        coroutineScope.launch {
            async { nonSuspendTask1() }
            async { nonSuspendTask2() }
        }
    }
/**Thread.sleep()을 사용해 작업을 block 시킴.*/
    fun nonSuspendTask1() {
        Thread.sleep(3000)
        Log.d("ExampleNonSuspend", "[nonSuspendTask1] After 3s in (${Thread.currentThread().name})")
        Thread.sleep(3000)
        Log.d("ExampleNonSuspend", "[nonSuspendTask1] After 3s in (${Thread.currentThread().name})")

        Log.d("ExampleNonSuspend", "[nonSuspendTask1] END in (${Thread.currentThread().name})*****")
    }

    fun nonSuspendTask2() {
        Thread.sleep(1000)
        Log.d("ExampleNonSuspend", "[nonSuspendTask2] After 1s in (${Thread.currentThread().name})")
        Thread.sleep(3000)
        Log.d("ExampleNonSuspend", "[nonSuspendTask2] After 4s in (${Thread.currentThread().name})")

        Log.d("ExampleNonSuspend", "[nonSuspendTask2] END in (${Thread.currentThread().name})******")
    }
}