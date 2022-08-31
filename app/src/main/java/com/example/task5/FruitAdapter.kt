package com.example.task5

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(
    private val fruitList: List<Fruit>
) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemFruitView =
            LayoutInflater.from(parent.context).inflate(R.layout.fruit_item, parent, false)
        return FruitViewHolder(itemFruitView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val curremtFruit = fruitList[position]
        holder.bindFruit(curremtFruit)
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }

    inner class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val FruitName: TextView
        private val FruitImage: ImageView

        init {
            FruitName = itemView.findViewById(R.id.Fruit_Name_Label)
            FruitImage = itemView.findViewById(R.id.Fruit_Image)
            itemView.setOnClickListener {
                val currentFruit = fruitList[layoutPosition]
                val intent = Intent(itemView.context, FruitDetailsActivity::class.java)
                intent.putExtra("FRUIT_KEY", currentFruit)
                itemView.context.startActivity(intent)
            }
        }

        fun bindFruit(fruit: Fruit) {
            FruitName.text = fruit.FruitName
            FruitImage.setImageResource(fruit.FruitImage)


        }
    }

}