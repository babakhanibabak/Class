package com.example

import com.example.constructors.Cons1
import com.example.extentionFunction.User
import com.example.innerClass.InnerClass
import com.example.internal.VMInternalClass
import com.example.sealedclass.Operation
import com.example.nestedClass.NestedClass
import com.example.operatorOverloading.Score
import com.example.visibilityModifiers.VMProtectedClass
import java.util.TreeMap


fun main() {

    //sealed class
    val operationAdd = Operation.Add(5)
    operationAdd.addOperator()

    //nestedClass
    val userClass = NestedClass()
    userClass.showName()
    userClass.showName()
    val userClassCity = NestedClass.City()
    userClassCity.showCity()
    val userClassAge = NestedClass.Age()
    userClassAge.showAge()

    //innerClass
    val humanClass = InnerClass()
    humanClass.showName()
    humanClass.City().showCity()
    humanClass.Age().showAge()
    /*-------------------------------------------------------------------------------*/
    //protected Class
    val protectedClass = VMProtectedClass()


    //internal Class
    val internalClass = VMInternalClass()
    internalClass.showName1()
    internalClass.name

    /*از فراخوانی زیر چون در یک پکیج دیگر می باشد نمیتوان از آن استفاده کرد و این ویژگیinternalClass می باشد
    internalClass.InternalChild().showName2()    */

    //operator over loading

    val score = Score()
    //score.plus(5)
    score + 5
    //score.div(4)
    score / 4

   // extension function
    val user=User()
    user.setValues("Babak", "Babakhani")
    user.getValues()
//
    println(".........................")
    //Tree Map
    val user55= TreeMap<String, String>()
    user55["name"]= "Babak"
    user55["family"]="Babakhani"
    user55["city"]="Sanandaj"
    user55["State"]="Sanandaj"

    //println(user55["name"])
    for ((key,value ) in user55){
        println("$key-> $value")
    }

    //constructor
    val user22=Cons1("Babak" ,5)

}


// extension function
fun User.setValues(_name: String, _family: String) {
    name=_name
    family=_family
}

fun User.getValues(){
    println("$name $family")
}
