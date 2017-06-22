package chapter.ch05.step2

/**
 * https://try.kotlinlang.org
 * GroupByConvertingAListToAMapOfGroups1
 */

fun main(args: Array<String>) {
    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))
}
