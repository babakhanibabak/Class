package com.example.generic

//we can write 2 or more valuable with 2 generic
class Generic2 <T,M>(val a:T,val b:M)

fun main(){
    /* we can use one type of data or 2 type of that
    for example we write String and Int type
     but we can write one of that */

    val generic=Generic2<String,Int>("Babak",34)
    println("${generic.a}  is ${generic.b}")


}