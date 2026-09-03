package com.example.petshop

class Sad(date: String) : Mood(date) {
    override fun moodDescription(): String {
        return "Sad"
    }
}