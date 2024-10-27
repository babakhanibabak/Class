package com.example.interfaceExercise

class Rectangle:Shape {

    override var length: Int=4
    override var width: Int=8


    override fun calculateArea() {
       println("this rectangle area is ${length*width}")
    }
}