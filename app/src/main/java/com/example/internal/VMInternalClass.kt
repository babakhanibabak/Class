package com.example.internal

open class VMInternalClass {

    internal val name = "Babak"
    internal fun showName() {
        println("Name is $name")
    }

    class InternalChild():VMInternalClass(){
        fun showName2(){
            println(name)
        }
    }
}