package com.example.task5

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Fruit(val FruitName:String,val FruitImage:Int,val FruitDescription:String?) : Parcelable{
}