package com.example.exercise

fun main(){
    val cars= arrayOf("renault","volvo","citroen","mazda")

    //access an array
    println(cars[0])

    //change an array element
    cars[0]="BMW"
    println(cars[0])

    //length or size of array
    println(cars.size)

    //check if an element exists in an array
    if ("volvo" in cars){
        println("it is exist")
    }else{
        "it does not exist"
    }

    //loop an array
    for (x in cars){
        println(x)
    }

    // array of integers
    val nums= arrayOf(1,2,3,4,5)
    for (x in nums){
        println(x)
    }
}