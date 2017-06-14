package com

/**
 * Created by KITV-NB22 on 2017-06-07.
 * Using a for loop
 * Using a while loop
 */


fun main(args: Array<String>) {
    var items = listOf("apple", "banana", "kiwi")

    println("#Using a for loop")
    for (item in items){
        println(item)
    }

    for (index in items.indices){
        println("item at $index is ${items[index]}")
    }

    println("\n#Using a while loop")
    var index = 0
    while (index < items.size){
        println("item at $index is ${items[index]}")
        index++
    }

}