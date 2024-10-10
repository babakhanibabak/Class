package com.example.visibilityModifiers

open class VMProtectedClass {
    protected val name = "Babak"
    protected fun showName() {
        println("Name is $name")
    }

    class ProtectedChild() : VMProtectedClass() {
        fun showName2() {
            println(name)
        }
    }

}

fun main() {
    val protectedClass = VMProtectedClass()
    // نمیتوان ازProtectedClass آبجکت درست کرد و باید مستقیماً از عنوان کلاس استفاده کرد
    VMProtectedClass.ProtectedChild().showName2()

}