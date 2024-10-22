package com.example.dataClass


data class Student(
    val name:String,
    val age: Int
)

fun main(){
    val student=Student("Babak",34)
    println(student)
    println(student.age)
}
