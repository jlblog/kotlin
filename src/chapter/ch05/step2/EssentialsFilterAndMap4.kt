package chapter.ch05.step2

/**
 * https://try.kotlinlang.org
 * EssentialsFilterAndMap4
 */

fun main(args: Array<String>) {
    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })
}