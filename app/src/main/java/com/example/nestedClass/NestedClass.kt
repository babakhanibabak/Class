package com.example.nestedClass

class NestedClass {
    val name = "Babak"
    fun showName() {
        println("Name is $name")
    }

    class City {
        val cityName = "Sanandaj"
        fun showCity() {
            println("City  is $cityName")
        }
    }

    class Age {
        val age = 34
        fun showAge() {
            println("Age is $age")
        }
    }
}

fun main(){
    //nestedClass
    val userClass = NestedClass()
    userClass.showName()
    userClass.showName()
    val userClassCity = NestedClass.City()
    userClassCity.showCity()
    val userClassAge = NestedClass.Age()
    userClassAge.showAge()
}