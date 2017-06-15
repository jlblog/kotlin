package chapter.ch03.step1

/**
 * https://try.kotlinlang.org
 * CreatingCollectionsInKotlin
 */

val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun main(args: Array<String>) {
    println(chapter.ch03.step1.set.javaClass)
    println(chapter.ch03.step1.list.javaClass)
    println(chapter.ch03.step1.map.javaClass)
}