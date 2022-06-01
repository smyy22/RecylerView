package com.sumeyyeemre.foodrecyclerviewdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.sumeyyeemre.foodrecyclerviewdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        val foodList=ArrayList<FoodModel>()
        foodList.add(FoodModel(R.drawable.pizza,"pizza"))
        foodList.add(FoodModel(R.drawable.makarna,"makarna"))
        foodList.add(FoodModel(R.drawable.pizza,"pizza"))
        foodList.add(FoodModel(R.drawable.makarna,"makarna"))
        foodList.add(FoodModel(R.drawable.pizza,"pizza"))
        foodList.add(FoodModel(R.drawable.makarna,"makarna"))
        foodList.add(FoodModel(R.drawable.pizza,"pizza"))
        foodList.add(FoodModel(R.drawable.makarna,"makarna"))

        val adapter=FoodAdapter(foodList)
        val linearLayoutManager=LinearLayoutManager(this)
        activityMainBinding.recyclerView.layoutManager=linearLayoutManager
        activityMainBinding.setVariable(BR.adapter,adapter)
    }
}