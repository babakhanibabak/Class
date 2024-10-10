package com.example.internal

open class VMInternalClass {

    internal val name = "Babak"
    internal fun showName1() {
        println("Name is $name")
    }

    class InternalChild():VMInternalClass(){
        fun showName2(){
            println(name)
        }
        fun showFamily(){
            val family="Babakhani"
            println("$name - $family")
        }
    }
}

fun main (){
    val internalClass = VMInternalClass()
    internalClass.showName1()
    internalClass.name

    //نحوه استفاده از یک کلاس داخل یک کلاس دیگر
    VMInternalClass.InternalChild().showName2()
    VMInternalClass.InternalChild().showFamily()


}