package chapter.ch05.step2

/**
 * https://try.kotlinlang.org
 * EssentialsFilterAndMap1
 */

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age > 30})
}