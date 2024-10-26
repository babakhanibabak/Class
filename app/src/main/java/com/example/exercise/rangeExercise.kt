package com.example.exercise

fun main(){

    //range of characters
    for (chars in 'a'..'f'){
        println(chars)
    }

    //range of numbers
    for (x in 5..10) {
        println(x)
    }

    //check if a value exists in a range
    val nums= arrayOf(5,4,6,8)
    if (4 in nums){
        println("it exist")
    }else{
        println("it doesn't exist")
    }

    //break
    for (i in 1..5) {
        if (i == 3){
            break
        }
        println(i)
    }

    //continue
for (i in 9..14){
    if (i==13){
        continue
    }
    println(i)
}
    }