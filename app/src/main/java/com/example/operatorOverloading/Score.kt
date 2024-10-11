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


fun main(){
    val score = Score()

    //score.plus(5)
    score + 5
    //score.div(4)
    score / 4


}