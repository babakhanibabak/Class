package com.example.generic

class Generic1<T>(val a:T, val b:T)


fun main(){

    // write type of data it is not necessary and we can write it or does not write it
    val generic=Generic1<String>("Babak","Babakhani")
    println("${generic.a} ${generic.b}")

    val sumNumbers =Generic1<Int>(7,4)
    println(sumNumbers.a+sumNumbers.b)
}