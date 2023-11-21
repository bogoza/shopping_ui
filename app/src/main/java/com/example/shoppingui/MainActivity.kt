package com.example.shoppingui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingui.adapter.CategoryAdapter
import com.example.shoppingui.data.CategoryModel
import com.example.shoppingui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: CategoryAdapter
    private lateinit var list:ArrayList<CategoryModel>

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addBtn()
    }


 private fun addBtn(){
     list = ArrayList()
     list.add(CategoryModel("All"))
     list.add(CategoryModel("Party"))
     list.add(CategoryModel("Camping"))
     list.add(CategoryModel("Category1"))
     list.add(CategoryModel("Category2"))
     list.add(CategoryModel("Category3"))

     adapter = CategoryAdapter(list)
     binding.rvCategory.adapter = adapter
     binding.rvCategory.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)


 }


}