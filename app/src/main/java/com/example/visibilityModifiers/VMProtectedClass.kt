package com.example.visibilityModifiers

open class VMProtectedClass {
    protected val name = "Babak"
    protected fun showName() {
        println("Name is $name")
    }

    class protectedChild():VMProtectedClass(){
        fun showName2(){
            println(name)
        }
    }
}