package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var adapter = binding.recyclerview.adapter
        adapter= Adapter()
        Adapter().setList(listOf("kevin","daisy","bob","bruno","carla","kitty"))

        /**값 및 변수 선언: 딱 2가지*/
        /*암시적 타입선언*/
        val name = "이용인" //value, 불변변수
        var name2 = "응그래" //variable, 가변변수
        name2 = "장그래"
        /*명시적 타입선언*/
        val name3:String = "송주녕"
        var name4:Int = 2020

        /**코틀린 자료형*/
        /**함수 선언*/
        /**람다 표현식 선언*/
        /**클래스 인터페이스 선언*/
        /**클래스 객체 == 인스턴스 생성*/
        var test1 = TestClass()
        /**상속메소드 선언*/
        /**코틀린 메소드와 함수의 차이는*/
    }
}