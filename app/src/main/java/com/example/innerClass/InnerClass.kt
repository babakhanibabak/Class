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
    }
