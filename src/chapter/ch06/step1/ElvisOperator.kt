package chapter.ch06.step1

/**
 * https://try.kotlinlang.org
 * ElvisOperator
 */

fun strLenSafe2(s: String?): Int = s?.length ?: 0

fun main(args: Array<String>) {
    println(strLenSafe2("abc"))
    println(strLenSafe2(null))
}
