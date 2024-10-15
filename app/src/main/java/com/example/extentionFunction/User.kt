package com.example.extentionFunction

import com.example.getValues
import com.example.setValues

class User {
var name:String=""
var family:String=""
}

fun main(){
    val user=User()
    user.setValues("Babak", "Babakhani")
    user.getValues()

    user.setValues("foad","babakhani")
    user.getValues()

    val job ="Android developer"
    println(job.reverse())

}

fun String.reverse():String{
    return this.reversed()
}

fun User.setValues(_name: String, _family: String) {
    name=_name
    family=_family
}

fun User.getValues(){
    println("$name $family")
}