package com.example.operatorOverloading

class Score {
    var myScore=8

    infix operator fun plus(number: Int){
println("Plus is operator overLoading ${myScore +number}")
    }

    infix operator fun div(number: Int){
        println("Div is operator overLoading ${myScore /number}")
    }

    infix operator fun times (number: Int){
        println("times is operator overLoading ${myScore*number}")
    }

    infix operator fun minus(number: Int){
        println("minus is operator overLoading ${myScore-number}")
    }
}


fun main(){
    val score = Score()

    //plus operator
   score.plus(5)
    score + 5

    //divide operator
    score.div(4)
    score / 4

    //times operator
    score.times(5)
    score*3

    //minus operator
    score.minus(2)
    score-3

}