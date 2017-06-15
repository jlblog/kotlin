package chapter.ch03.step1

/**
 * https://try.kotlinlang.org
 * CreatingColectionsInKotlin
 */

fun main(args: Array<String>) {
    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers = setOf(1, 14, 2)
    println(numbers.max())
    println(numbers.min())
}
