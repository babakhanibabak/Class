package com.example.arrays

fun main() {
    //arrayOf different type of data
    val a = arrayOf(1, 5, "babak", true, 9.54, 8.5f)

    //arrayOf same type of data with create limit for it
    val a2 = arrayOf<Int>(4, 85, 9)

    //arrayOf arrays
    val a3 = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    for (i in a3) {
        for (j in i) {
            println("$j")
        }
        println()
    }
}