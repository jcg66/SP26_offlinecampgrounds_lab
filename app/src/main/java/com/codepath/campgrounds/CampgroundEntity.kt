package com.codepath.campgrounds

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "campground_table")
data class CampgroundEntity (
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "description") val description: String?,
    @ColumnInfo(name = "rawLatitude") val rawLatitude: String?,
    @ColumnInfo(name = "rawLongitude") val rawLongitude: String?,
    @ColumnInfo(name = "imageUrl") val imageUrl: String?
)