package com.example.sealedclass

sealed class Operation {
    val number=2
    class Add(private val value: Int):Operation(){
        fun addOperator(){
            print(value+number)
        }
    }

}