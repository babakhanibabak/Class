package com.example.enumClass

enum class DaysOfWeek {
    Saturday,
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday
}

fun main(){
    println(DaysOfWeek.Monday)

    for (day in DaysOfWeek.values()){
        println("${day.ordinal} = ${day.name}")
    }
}