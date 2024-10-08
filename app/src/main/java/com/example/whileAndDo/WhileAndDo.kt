package com.example.whileAndDo

fun main(){
    var num1=15
    while (num1>10){
        println(num1)
        num1--
    }

    println("---------------------------------------")

    //another example (do - While)
    var num2=17
    do {
        println("$num2 ")
        num2--
    }while (num2>10)
}