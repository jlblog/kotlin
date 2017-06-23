package chapter.ch06.step1

/**
 * https://try.kotlinlang.org
 * SafeCallOperator
 */

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

fun main(args: Array<String>) {
    printAllCaps("abc")
    printAllCaps(null)
}