package com.example.kotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.kotlin.databinding.ItemBinding

class Adapter: RecyclerView.Adapter<ViewHolder>() {
    private var list = ArrayList<String>()

    inner class MyViewHolder(private val binding:ItemBinding):ViewHolder(binding.root){
        fun bind(content:String){
            binding.textView.text = content
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        var itemView = ItemBinding.inflate(layoutInflater, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(holder is MyViewHolder) holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setList(input_list:List<String>){
        list.addAll(input_list)
    }
}