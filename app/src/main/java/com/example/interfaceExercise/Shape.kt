package com.example.interfaceExercise

interface Shape {
    var length: Int
    var width: Int
    fun calculateArea()

    // ** functions in interfaces don't have body
    //** we don't have private fun inside interfaces
}