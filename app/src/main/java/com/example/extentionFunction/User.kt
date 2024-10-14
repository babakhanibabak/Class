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
}