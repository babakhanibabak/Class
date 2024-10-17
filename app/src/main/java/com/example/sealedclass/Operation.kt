package com.example.sealedclass


sealed class Operation {
    val number = 2

    class Add(private val value: Int) : Operation() {
        fun addOperator() {
            print(value + number)
        }
    }

    class Multiply(private val value: Int) : Operation() {
        fun multiplyOperator() {
            println(value * number)
        }
    }

    class Subtract(private val value: Int) : Operation() {
        fun subtractOperator() {
            println(value - number)
        }
    }

    class Divide(private val value: Int) : Operation() {
        fun divideOperator() {
            println(value / number)
        }
    }


}

fun main() {

    val operation = Operation.Add(5)
    operation.addOperator()
    val operation2 = Operation.Multiply(3)
    operation2.multiplyOperator()

}