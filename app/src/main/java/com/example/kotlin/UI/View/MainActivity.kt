package com.example.kotlin.UI.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin.Util.coroutine.ExampleNonSuspend
import com.example.kotlin.Util.coroutine.ExampleSuspend
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
        /**ListFragment 등록*/
        supportFragmentManager
            .beginTransaction()
            .replace(binding.layout.id, ListFragment())
            .commit()
    }
}