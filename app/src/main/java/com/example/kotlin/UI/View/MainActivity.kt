package com.example.kotlin.UI.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin.UI.View.ListFragment
import com.example.kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
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