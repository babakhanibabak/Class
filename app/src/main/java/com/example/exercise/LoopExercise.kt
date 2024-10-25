package com.example.exercise

fun main(){

    //do-while
    var i = 0
    do {
        println(i)
        i++
    } while (i < 3)


    println("..............................................")

    //while
    var a = 5
    while (a < 7) {
        a++
        println(a)
    }
    println("..............................................")

    //when
    val day=4
    val result=when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else ->"the day invalid"
    }
    println(result)



}