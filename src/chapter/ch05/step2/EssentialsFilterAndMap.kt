package chapter.ch05.step2

/**
 * https://try.kotlinlang.org
 * EssentailsFilterAndMap
 */

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0})
}