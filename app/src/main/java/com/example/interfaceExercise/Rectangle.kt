package com.example.interfaceExercise

class Rectangle:Shape ,Shape2{

    override var length: Int=4
    override var width: Int=8


    override fun calculateArea() {
       println("this rectangle area is ${length*width}")
    }

    override var testShape2: String="Babak Babakhani"
}

fun main(){
    val rectangle=Rectangle()
    rectangle.calculateArea()
}