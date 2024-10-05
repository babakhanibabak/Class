package com.example.whenLoop

fun main(){

    var a=3
    when(a){
        1 -> println("a is 1")
        2 -> println("a is 2")
        3 -> println("a is 3")
4 -> {
    a=5
    println("a is 5")
}
        else -> println("a is not 1,2,3")
    }
}