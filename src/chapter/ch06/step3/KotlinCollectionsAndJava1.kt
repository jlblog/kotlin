package chapter.ch06.step3

/**
 * https://try.kotlinlang.org
 * KotlinCollectionsAndJava1
 */

// Kotlin
// collections.kt

fun printInUppercase(list: List<String>) {
    //println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}

fun main(args: Array<String>) {
    val list = listOf("a", "b", "c")
    printInUppercase(list)
}