package com.example.generic

class Generic1<T>(val a:T, val b:T)


fun main(){
    val generic=Generic1("Babak","Babakhani")
    println("${generic.a} ${generic.b}")
}