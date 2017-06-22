package chapter.ch05.step2

/**
 * https://try.kotlinlang.org
 * EssentialsFilterAndMap3
 */

data class Person2(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person2("Alice", 29), Person2("Bob", 31))
    println(people.map { it.name })
}