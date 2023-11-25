package com.example.shoppingui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingui.adapter.CategoryAdapter
import com.example.shoppingui.adapter.ItemAdapter
import com.example.shoppingui.data.CategoryModel
import com.example.shoppingui.data.ItemModel
import com.example.shoppingui.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: CategoryAdapter
    private lateinit var itemAdapter: ItemAdapter
    private lateinit var list: ArrayList<CategoryModel>

    private lateinit var binding: ActivityMainBinding
    private val itemList: MutableList<ItemModel> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addBtn()
        addItem()
    }


    private fun addBtn() {
        list = ArrayList()
        list.add(CategoryModel("All"))
        list.add(CategoryModel("Party"))
        list.add(CategoryModel("Camping"))
        list.add(CategoryModel("Category1"))
        list.add(CategoryModel("Category2"))
        list.add(CategoryModel("Category3"))

        adapter = CategoryAdapter(list)

        binding.rvCategory.adapter = adapter
        binding.rvCategory.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

    }

    private fun addItem() {
        Random.nextInt(50, 200)
        itemAdapter = ItemAdapter()
        binding.rvItem.layoutManager = GridLayoutManager(this, 2)
        binding.rvItem.adapter = itemAdapter
        itemAdapter.setData(itemList)
        itemList.add(
            ItemModel(
                image = R.drawable.girl1,
                title = "girl1",
                price = Random.nextInt(50, 200).toString()
            )
        )
        itemList.add(
            ItemModel(
                image = R.drawable.girl3,
                title = "girl2",
                price = Random.nextInt(50, 200).toString()
            )
        )
        itemList.add(
            ItemModel(
                image = R.drawable.girl4,
                title = "girl3",
                price = Random.nextInt(50, 200).toString()
            )
        )
        itemList.add(
            ItemModel(
                image = R.drawable.girl1,
                title = "girl4",
                price = Random.nextInt(50, 200).toString()
            )
        )
        ItemModel(
            image = R.drawable.girl3,
            title = "girl1",
            price = Random.nextInt(50, 200).toString()
        )

        itemList.add(
            ItemModel(
                image = R.drawable.girl4,
                title = "girl2",
                price = Random.nextInt(50, 200).toString()
            )
        )
        itemList.add(
            ItemModel(
                image = R.drawable.girl1,
                title = "girl3",
                price = Random.nextInt(50, 200).toString()
            )
        )
        itemList.add(
            ItemModel(
                image = R.drawable.girl3,
                title = "girl4",
                price = Random.nextInt(50, 200).toString()
            )
        )

    }


}