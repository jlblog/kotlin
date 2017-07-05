package chapter.ch07.step1

/**
 * https://try.kotlinlang.org
 * CompoundAssignmentOperators2
 */

fun main(args: Array<String>) {
    val list = arrayListOf(1, 2)
    list += 3
    list.add(10)
    val newList = list + listOf(4, 5)
    println(list)
    println(newList)
}