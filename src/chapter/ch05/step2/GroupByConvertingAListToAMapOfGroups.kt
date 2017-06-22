package chapter.ch05.step2

/**
 * https://try.kotlinlang.org
 * GroupByConvertingAListToAMapOfGroups
 */

data class Person5(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person5("Alice", 31), Person5("Bob", 29), Person5("Carol", 32))
    println(people.groupBy { it.age })
}