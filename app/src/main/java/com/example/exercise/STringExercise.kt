package com.example.exercise

fun main() {

    //length of string
    val text = "BabakBabakhani"
    println(text.length) // output is 14

    //compare 2 string
    val txt1 = "apple"
    val txt2 = "apple"
    println(txt1.compareTo(txt2)) //output is 0 because 2 string is equal

    //find string inside string
    val txt = "Please locate where 'locate' occurs!"
    println(txt.indexOf("locate")) //output is 7

    //merge 2 strings
    var firstname = "Babak"
    var lastname = "Babakhani"
    println(firstname + " " + lastname)
    //merge 2 strings
    println(firstname.plus(lastname))



}