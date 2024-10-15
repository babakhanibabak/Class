package com.example.constructors

class Cons1(id:Int) {

    init {
        when(id){
            1 -> {
                println(" Babak")
            }
            2 ->{
                println(" Foad")
            }
            3->{
                println(" hosain")
            }
        }
    }
    constructor(name: String,family:String,id: Int):this(id){
        println( "$name $family $id")
    }
    constructor(instaName:String, id: Int):this(id){
        println(instaName)
    }
}

fun main(){
    val user=Cons1("Babak" ,5)
    val user2=Cons1(name = "Babak", family = "Babakhani",34)
    val user3=Cons1(1)
}