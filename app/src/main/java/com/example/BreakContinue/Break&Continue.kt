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

    println("---------------------")

    // 2 for loop with break  and continue

   iLoop@ for (i in 1..7){
    jLoop@  for (j in 1..4){
            if (j==3){
                continue@jLoop
            }
        println("$i-$j")
        }
    }
}