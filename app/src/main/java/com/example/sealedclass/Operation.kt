package com.example.sealedclass

import android.graphics.Path.Op

sealed class Operation {
    val number=2
    class Add(private val value: Int):Operation(){
        fun addOperator(){
            print(value+number)
        }
    }

    class Multiply(private val value:Int):Operation(){
        fun multiplyOperator(){
            println(value*number)
        }
    }



}

fun main(){

    val operation=Operation.Add(5)
operation.addOperator()
}