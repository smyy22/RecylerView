package com.sumeyyeemre.foodrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var foodList: ArrayList<Food>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)

        foodList= ArrayList()
        foodList.add(Food(R.drawable.pizza,"pizza"))
        foodList.add(Food(R.drawable.makarna,"makarna"))
        foodList.add(Food(R.drawable.pizza,"pizza"))
        foodList.add(Food(R.drawable.makarna,"makarna"))
        foodList.add(Food(R.drawable.pizza,"pizza"))
        foodList.add(Food(R.drawable.makarna,"makarna"))
        foodList.add(Food(R.drawable.pizza,"pizza"))
        foodList.add(Food(R.drawable.makarna,"makarna"))


        foodAdapter=FoodAdapter(foodList)
        recyclerView.adapter=foodAdapter

    }
}