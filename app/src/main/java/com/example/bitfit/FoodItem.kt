package com.example.bitfit

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "HealthHealthDAO\n" +
        "ItemRepository\n" +
        "ItemViewModelData")
class FoodItem (
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "Foodname") val foodname: String?,
    @ColumnInfo(name = "Calories")  val calories: Int?
)