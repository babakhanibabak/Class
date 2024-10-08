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

    // when loop for 2 or more numbers
    val b=4
    when(b){
        1,2,3 -> println("b is 1,2,3")
        4,5,6 -> println("b is 4,5,6")
        else -> println("b is not 1,2,3,4,5,6")
    }

    //when loop for range
    val c=5
when(c){
    in 1..6 -> println("c is in 1..6")
    in 7..10 -> println("c is in 7..10")
    else -> println("c is not < 10")
}


}