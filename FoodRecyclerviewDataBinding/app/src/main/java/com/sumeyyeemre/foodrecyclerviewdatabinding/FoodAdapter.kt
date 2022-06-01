package com.sumeyyeemre.foodrecyclerviewdatabinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.sumeyyeemre.foodrecyclerviewdatabinding.databinding.EachItemBinding

class FoodAdapter(val foodList: List<FoodModel>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val foodBinding=DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context),R.layout.each_item,parent,false
        )
        return FoodViewHolder(foodBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as FoodViewHolder).onBind(foodList.get(position))
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    class FoodViewHolder(val foodBinding: ViewDataBinding):RecyclerView.ViewHolder(foodBinding.root){
        fun onBind(foodModel: FoodModel){
            val binding= foodBinding as EachItemBinding
            binding.setVariable(BR.itemfoods,foodModel)
        }
    }

}