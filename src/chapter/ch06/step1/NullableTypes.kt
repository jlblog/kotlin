package chapter.ch06.step1

/**
 * https://try.kotlinlang.org
 * NullableTypes
 */

fun strLenSafe(s: String?): Int =
        if (s != null) s.length else 0

fun main(args: Array<String>) {
    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))
}