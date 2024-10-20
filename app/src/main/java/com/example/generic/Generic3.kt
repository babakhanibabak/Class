package com.example.generic

class Generic3<T, M>(val a: T, val b: T, val c: M) {

    fun <N> showItems(vararg items: N) {
        items.forEach { i -> print("$i  ") }
    }
}


fun main() {

    /* number of generis don't related to entrance  */
    val generic = Generic3<String, Int>("Babak", "Babakhani", 34)
    println("${generic.a} ${generic.b} ${generic.c}")

    /* when we use method inside class */
    generic.showItems<Int>(10,20,30,40,50,60)
}