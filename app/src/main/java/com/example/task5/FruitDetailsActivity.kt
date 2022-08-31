package com.example.task5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FruitDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_details)

        val fruit=intent.getParcelableExtra<Fruit>("FRUIT_KEY")
        val imageView:ImageView=findViewById(R.id.FruitImage)
        val fruitName:TextView=findViewById(R.id.FruitName)
        val fruitDesc:TextView=findViewById(R.id.ImageDescription)
        fruitName.text=fruit?.FruitName
        fruitDesc.text=fruit?.FruitDescription
        fruit?.let { imageView.setImageResource(it.FruitImage) }
    }
}