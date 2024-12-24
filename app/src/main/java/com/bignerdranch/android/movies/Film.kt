package com.bignerdranch.android.movies

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.time.LocalDate
import java.util.Date
import java.util.UUID

@Entity
data class Film (@PrimaryKey val id: UUID = UUID.randomUUID(),
                 var title:String="",
                 var date: LocalDate = LocalDate.now(),
                 @SerializedName("Poster") var posterUrl: String = "",
                 var watched:Boolean=false)