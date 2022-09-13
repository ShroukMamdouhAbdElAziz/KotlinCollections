package com.example.kotlincollections

import android.os.Build
import androidx.annotation.RequiresApi


// Map : is a datastructure contains the elements in the form of key-value Pair
// each value is connected to specific key

// Immutable Map  :mapOf
//mutable Map  : HashMap ,hashMapOf, mutableMapOf

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    // mapOf is immutable , so it has a fixed size ,read only operations

    //mapOf<Int ,String>  enter <type of Key ,type of value >
    // add the elements in the constructor in the form of key-value pairs
    // There is no sequence for the key

    var myMap = mapOf<Int, String>(1 to "Ali", 20 to "Shrouk", 15 to "kareem")

    println(myMap.get(20))
    println(myMap.getValue(15))
    //===================================================================================
    // read only operations
    for (element in myMap) {   // output will be like that 1=Ali 20=Shrouk 15=Kareem
        println(element)
    }
//======================================================================================
    println()

    // if you want to print the keys only
    //=====================================
    for (key in myMap.keys) {
        println(key)
    }

    println()
//======================================================================
    // if you want to print the values only
    //========================================
    for (value in myMap.values) {
        println(value)
    }

    println()

    //or
    for (key in myMap.keys) {
        //println(myMap[key]) //or
        // println(myMap.get(key))

        println("element present at key ${key} is equal ${myMap[key]}")
    }
    println()
//=========================================================================
    //or
    println(myMap.toString()) //output will be {1=Ali, 20=Shrouk, 15=kareem}

    println()

//========================================================================
    //** using Mutable Map : HashMap , hashMapOf , mutableMapOf
    var map = HashMap<Int, String>()
    map.put(1, "Ali")
    map.put(10, "Omar")
    map.put(20, "Hoda")
    map.replace(20, "Shrouk")
    // map.clear()  // all the values will be cleared with their keys
    println(map.toString())

//===============================================================================
    var map1 = hashMapOf<Int, String>()
    map1.put(1, "Ali")
    map1.put(10, "Omar")
    map1.put(20, "Hoda")
    map1.remove(10)

    println(map1.toString())
    //=============================================================================

    var map2 = mutableMapOf<Int, String>()
    map2.put(1, "Hello")
    map2.put(2, "welcome")

    println(map2.toString())
}
