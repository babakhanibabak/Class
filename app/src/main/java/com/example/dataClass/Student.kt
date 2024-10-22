package com.example.dataClass


data class Student(
    val name:String,
    val age: Int
)

fun main(){

    val student=Student("Babak",34)
    println(student)
    println(student.age)


    // another way for use of copy
    val student2=student.copy("foad",41)
    println(student2)
    println(student2.name)
}
