package com.example.BreakContinue

fun main(){

    //continue
    for (i in 1..10){
        if (i==5){
            continue
        }
        println(i)
    }

println("---------------------")

    //break
    for (i in 1..10){
        if (i==5){
            break
        }
        println(i)
    }
}