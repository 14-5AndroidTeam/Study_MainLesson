package com.example.kotlin.ui.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.kotlin.data.dto.Todos
import com.example.kotlin.databinding.ItemBinding

class Adapter: RecyclerView.Adapter<ViewHolder>() {
    private var list = arrayListOf<Todos>()

    /** 아이템을 넣을 커스텀 뷰홀더*/
    inner class MyViewHolder(binding: ItemBinding):ViewHolder(binding.root){
        val binding:ItemBinding = binding
        fun bind(data: Todos){
            binding.content.text = data.content
            binding.deadline.text = data.deadline
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemBinding.inflate(layoutInflater,parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(holder is MyViewHolder) holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setList(input_list:List<Todos>){
        list.addAll(input_list)
    }
}