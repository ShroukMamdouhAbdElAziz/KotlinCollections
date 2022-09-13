package com.example.kotlincollections

// List divide into
//==========================
// 1.Immutable List -> listOf
//===========================
//Fixed Size,Read Only ,so we can't modify it later only we can print the values inside it

//2. mutable List -> ArrayList , arrayListOf ,mutableListOf
//==============================================================
// we can change the size later ,has Noo fixed size
// can remove or add elements

fun main() {

    // list of (immutable list )
    // index:  0         1        2
    // Elements: "Ali","Kareem","Amir"

    var list = listOf<String>("Ali", "Kareem", "Amir")
    //list[0] = "Omar"  error as it is immutable, we can't modify it later , only print the values

    println(list.toString()) // output is [Ali, Kareem, Amir]

    // or

    for (element in list) { // for loop using individual element
        println(element)
    }

    println()

    for (index in 0..list.size - 1) {  // for loop using index of element
        println(list[index])
    }

    // or
    println()

    for (index in 0..list.size - 1) {  // for loop using index of element
        println(list.get(index))
    }
// ==========================================================================================================

    //2. mutable List -> ArrayList , arrayListOf ,mutableListOf
//==============================================================

    var myList = mutableListOf<String>("Ali", "Kareem", "Amir")

    myList.removeAt(1)
    myList.add("Shrouk")  // any new Element will be added at the end if we didn't specify the index no like below
    myList.add(1,"Omar") // or myList[1] = "Omar"

    println()
    println(myList.toString())
  //============================

    var list1 = arrayListOf<String>("Ali", "Kareem", "Amir")

    list1.removeAt(1)
    list1.add("Shrouk")  // any new Element will be added at the end if we didn't specify the index no like below
    list1.add(1,"Omar") // or myList[1] = "Omar"

    println()
    println(list1.toString())
    println()

    //==========================================
    var list2 = ArrayList<String>()

    // till now it is empty array
    println("array is ${list2.toString()}")

    list2.add("Shrouk")  // any new Element will be added at the end if we didn't specify the index no like below
    list2.add(1,"Omar") // or myList[1] = "Omar"

    println()
    println(list2.toString())

}