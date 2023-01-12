package com.example.kotlin.UI.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin.UI.View.ListFragment
import com.example.kotlin.Util.coroutine.ExampleScope
import com.example.kotlin.databinding.ActivityMainBinding
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    private lateinit var job1:Deferred<Any>
    private lateinit var job2:Job
    private lateinit var job3:Deferred<Any>
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /**코루틴 스코프 예제 테스트*/
        val coroutineExample = ExampleScope()
        coroutineExample.cancelFirstJob()
//        /**ListFragment 등록*/
//        supportFragmentManager
//            .beginTransaction()
//            .replace(binding.layout.id, ListFragment())
//            .commit()
    }
}