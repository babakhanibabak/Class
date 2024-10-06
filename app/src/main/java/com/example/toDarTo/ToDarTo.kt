package com.example.toDarTo

fun main(){
    val a=5
    val b=10

    if (a>4){
        println("a is bigger than b")
        if (b>10){
            println("a is bigger than 10")
        }
    }

    // another example
    for (i in 1..5){
        for (j in 1..i){
            println("$i--$j")

        }
    }
}