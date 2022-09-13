package com.example.kotlincollections

fun main() {

    // give the initial value for all the elements inside the array ex 0
    // Index :  0  1  2 3 4
    // Elements:0  0  0 0 0
    var myArray = Array<Int>(5) { 0 }
    // Array is mutable in major as we can modify the current value in the future but at the end it has a fixed size

    myArray[0] = 32
    myArray[3] = 54

    // if we want to print all the elements in the array ,  we have to use for loop
    for (element in myArray) {
        println(element)
    }

    println()
    // or

    for (index in 0..myArray.size - 1) {
        println(myArray[index])
    }

    //or
    println()

    for (x in 0 until myArray.size) {
        println(myArray[x])
    }

    println()
   // if we decide the type of array from the begiining , all the elements will get initial values by default
    var array = CharArray(4)
    for (element in array) {
        println(element)
    }

    println()
    // if we decide the type of array from the begiining , all the elements will get initial values by default
    var arr = IntArray(4)
     // arr[4] = 5 -> will get ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    for (element in arr) {
        println(element)
    }

    println()

    var arr1 = intArrayOf(1,2,3,4)
    // arr[4] = 5 -> will get ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4 as the Array is Fixed Size
    for (element in arr) {
        println(element)
    }

     // summary
    //============
    // Either Array<Type>(){} , IntArray(size) ,intArrayOf(the value of elements ) ex :intArrayOf(1,2,3,4)
// ->all have fixed size
    // as the Array has fixed size
    // so , in case we want to increase the Size , we can use ArrayList , arrayListOf , mutableListOf
}