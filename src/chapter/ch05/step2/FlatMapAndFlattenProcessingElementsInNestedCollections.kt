package chapter.ch05.step2

/**
 * https://try.kotlinlang.org
 * FlatMapAndFlattenProcessingElementsInNestedCollections
 */

fun main(args: Array<String>) {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
}
