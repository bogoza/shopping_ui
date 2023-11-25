package com.example.shoppingui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingui.R
import com.example.shoppingui.data.CategoryModel
import com.example.shoppingui.databinding.RvCategoryBinding


class CategoryAdapter(private val list: ArrayList<CategoryModel>): RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {


    inner class CategoryViewHolder(private val binding: RvCategoryBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(bindList:CategoryModel){
            binding.tvBtn.text = bindList.categoryButton
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding = RvCategoryBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CategoryViewHolder(binding)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val currentPosition = list[position]
        holder.bind(currentPosition)

    }
}