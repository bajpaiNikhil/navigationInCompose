package com.example.navigationincompose

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val firstName : String,
    val secondName : String
): Parcelable
