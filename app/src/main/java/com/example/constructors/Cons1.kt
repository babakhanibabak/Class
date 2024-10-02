package com.example.constructors

class Cons1(id:Int) {
    val name="$id => Mohammad"
    init {
        when(id){
            1 -> {
                println("$name Babak")
            }
            2 ->{
                println("$name Foad")
            }
            3->{
                println("$name hosain")
            }
        }
    }
    constructor(name: String,family:String,id: Int):this(id){
        println( "$name $family $id")
    }
    constructor(instaId:String,id: Int):this(id){
        println(instaId)
    }
}