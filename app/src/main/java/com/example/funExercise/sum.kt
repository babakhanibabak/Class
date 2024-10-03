package com.example.funExercise

fun sumNumbers(number1:Int,number2:Int){
    val a=number1+number2
    println(a)
}

fun sumNumbers2(number1:Int,number2:Int):Int{
    return number1+number2

}

fun main(){
    sumNumbers(5,5)

    val a=sumNumbers2(5,5)+5
    println(a)
}