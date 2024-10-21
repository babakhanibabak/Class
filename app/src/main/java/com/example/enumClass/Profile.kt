package com.example.enumClass

class Profile(private val users: Users) {

    fun showUserFamily(){
        if (users.userId==1)
            println("Babakhani")
    }
}

fun main(){
    val profile=Profile(Users.Babak)
    profile.showUserFamily()

println("${Users.Foad}'s id is ${Users.Foad.userId}")
}