package com.example.innerClass

class InnerClass {

        val name = "Babak"
        fun showName() {
            println("Name is $name")
        }

      inner  class City {
            val cityName = "Sanandaj"
            fun showCity() {
                println("$name City  is $cityName")
            }
        }

       inner class Age {
            val age = 34
            fun showAge() {
                println("${name} Age is $age")
            }
        }
    inner class Family{
        val family="Babakhani"
        fun showFamily(){
            println("my name is $name $family ")
        }
    }
    }

fun main(){
    val humanClass = InnerClass()
    humanClass.showName()
    humanClass.City().showCity()
    humanClass.Age().showAge()
    humanClass.Family().showFamily()
}
