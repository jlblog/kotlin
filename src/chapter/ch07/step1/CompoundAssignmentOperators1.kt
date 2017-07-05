package chapter.ch07.step1

/**
 * https://try.kotlinlang.org
 * CompoundAssignmentOperators1
 */

fun main(args: Array<String>) {
    val numbers = ArrayList<Int>()
    numbers += 42
    numbers += 11
    numbers.add(14)
    println(numbers[0])
    println(numbers[1])
    println(numbers[2])
}
