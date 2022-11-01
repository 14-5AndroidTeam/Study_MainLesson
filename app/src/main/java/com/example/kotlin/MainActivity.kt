package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var list:MutableList<String> = mutableListOf("kevin","kelly","jimmy","halsy","bob","peter","alex","charlie")
        /**어댑터 등록하기*/
        var adapter = Adapter()
        binding.recyclerview.adapter = adapter
        adapter.setList(list)

    }
}