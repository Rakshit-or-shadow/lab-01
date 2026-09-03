package com.example.petshop

abstract class Mood(val date: String) {
    abstract fun moodDescription(): String

    fun describeMood(): String {
        return "On $date:, mood is ${moodDescription()}"
    }
}