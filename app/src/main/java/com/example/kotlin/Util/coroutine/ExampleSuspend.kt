package com.example.kotlin.Util.coroutine

import android.content.ContentValues
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

class ExampleSuspend {
    fun main() {
        val coroutineScope = CoroutineScope(Dispatchers.IO)
        coroutineScope.async { SuspendTask1() }
        coroutineScope.async { SuspendTask2() }
    }
    /**Thread.sleep()을 사용해 작업을 block 시킴.*/
    suspend fun SuspendTask1() {
        delay(3000)
        Log.d("ExampleSuspend", "[SuspendTask1] After 3s in (${Thread.currentThread().name})")
        delay(3000)
        Log.d("ExampleSuspend", "[SuspendTask1] After 3s in (${Thread.currentThread().name})")

        Log.d("ExampleSuspend", "[SuspendTask1] END 3s in (${Thread.currentThread().name})*****")
    }

    suspend fun SuspendTask2() {
        delay(1000)
        Log.d("ExampleSuspend", "[SuspendTask2] After 1s in (${Thread.currentThread().name})")
        delay(3000)
        Log.d("ExampleSuspend", "[SuspendTask2] After 4s in (${Thread.currentThread().name})")

        Log.d("ExampleSuspend", "[SuspendTask2] END in (${Thread.currentThread().name})*****")
    }
}