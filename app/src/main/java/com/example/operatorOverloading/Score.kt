package com.example.operatorOverloading

class Score {
    var myScore=8

    infix operator fun plus(number: Int){
println("Plus is operator overLoading ${myScore +number}")
    }

    infix operator fun div(number: Int){
        println("Div is operator overLoading ${myScore /number}")
    }
}