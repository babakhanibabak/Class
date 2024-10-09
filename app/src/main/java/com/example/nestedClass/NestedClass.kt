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

    class Family{
        val nestedClass=NestedClass().name
        val family="Babakhani"
        fun showFamily(){
            println("my name is $nestedClass $family ")
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

    val useClassFamily=NestedClass.Family()
    useClassFamily.showFamily()
}