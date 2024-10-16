package com.example.treeMap

import java.util.TreeMap

fun treeMap(){
    val userName= TreeMap<String, String>()
    userName["name"]= "Babak"
    userName["family"]="Babakhani"
    userName["city"]="Sanandaj"
    userName["State"]="Sanandaj"

    for ((key,value ) in userName){
        println("$key-> $value")
    }
}

