package com.example.shoppingui.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingui.data.ItemModel
import com.example.shoppingui.databinding.GirlItemBinding

class ItemAdapter: ListAdapter<ItemModel, ItemAdapter.ItemViewHolder>( object :
    DiffUtil.ItemCallback<ItemModel>(){
    override fun areItemsTheSame(oldItem: ItemModel, newItem: ItemModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ItemModel, newItem: ItemModel): Boolean {
        return oldItem == newItem
    }
}

) {
    fun setData(item:MutableList<ItemModel>){
        submitList(item)
    }
    inner class ItemViewHolder(private val binding:GirlItemBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(){
            val item = currentList[adapterPosition]
            binding.imgGirl.setImageResource(item.image)
            binding.tvPrice.text = item.price
            binding.tvGirlDesc.text = item.title

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            GirlItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind()
    }
}