package com.example.forLoop

fun main(){

    for (i in 1..5){
        for (j in 1..i){
            print("*")
        }
        println()
    }

    // another example
    for (x in 1..10){
        println(x)
    }
    // another example
    for (x in 1 until 10){
        println(x)
    }

    // another example
    for (x in 1 until 10 step 2){
        println(x)
    }

    // another example
    for (x in 10 downTo 1 step 2){
        println(x)
    }
    // another example
    val names= listOf("Babak","Foad","Hossein")
    for (name in names){
        println(name)
    }

}