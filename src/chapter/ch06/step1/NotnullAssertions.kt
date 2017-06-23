package chapter.ch06.step1

/**
 * https://try.kotlinlang.org
 * NotnullAssertions
 */

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}

fun main(args: Array<String>) {
    ignoreNulls("string")
    ignoreNulls(null)
}