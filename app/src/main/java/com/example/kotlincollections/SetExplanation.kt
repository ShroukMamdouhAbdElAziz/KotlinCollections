package com.example.kotlincollections

// Set : contains a unique elements(so if there are repeated elements , it will ignore the repeated ones)
// hashSet :also contains unique elements but sequence is not guaranteed in  output

//==============
//Immutable set :SetOf
//mutable Set : hashSetOf , mutableSetOf

fun main(){
    var mySet = setOf<Int>(1,2,50,10,8,8)  // Immutable Set ,Read only , Fixed Size
    println(mySet.contains(0))  // output :false

    for (element in mySet){
        //println(element)
        println(element)
    }

    println()


    var set = mutableSetOf<Int>(10,15,30,40,55,30,30)
    set.add(20)
    set.remove(30)
    println(set.toString()) //[10, 15, 40, 55, 20]


    println()

    var result = hashSetOf<Int>(10,20,90,100,500)
    println(result.toString()) // output will be :[10, 90, 20, 100, 500]
    // so hashSet :also contains unique elements but sequence is not guaranteed in  output
}

// so , The difference between Set and hashSet
//================================================
// both of them have unquie elements but in hashSet the sequence is not guaranteed in output but in set it is quaranteed
