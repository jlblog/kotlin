package chapter.ch06.step2

/**
 * https://try.kotlinlang.org
 * NumberConversions1,2
 */

fun foo(l: Long) = println(l)

fun main(args: Array<String>) {
    //1
    val b: Byte = 1
    val l = b + 1L
    foo(42)

    //2
    println("42".toInt())
}