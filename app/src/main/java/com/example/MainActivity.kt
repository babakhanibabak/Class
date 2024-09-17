package com.example

import com.example.innerClass.InnerClass
import com.example.internal.VMInternalClass
import com.example.sealedclass.Operation
import com.example.nestedClass.NestedClass
import com.example.visibilityModifiers.VMProtectedClass


fun main(){
val operationAdd=Operation.Add(5)
    operationAdd.addOperator()

    //nestedClass
    val userClass=NestedClass()
    userClass.showName()
    userClass.showName()
    val userClassCity=NestedClass.City()
    userClassCity.showCity()
    val userClassAge=NestedClass.Age()
    userClassAge.showAge()

    //innerClass
    val humanClass=InnerClass()
    humanClass.showName()
    humanClass.City().showCity()
    humanClass.Age().showAge()
      /*-------------------------------------------------------------------------------*/
//protected Class
val protectedClass=VMProtectedClass()


    //internal Class
    val internalClass= VMInternalClass()
    internalClass.showName()
    internalClass.name

    /*از فراخوانی زیر چون در یک پکیج دیگر می باشد نمیتوان از آن استفاده کرد و این ویژگیinternalClass می باشد
    internalClass.InternalChild().showName2()    */


}