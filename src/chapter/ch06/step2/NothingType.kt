package chapter.ch06.step2

/**
 * https://try.kotlinlang.org
 */

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main(args: Array<String>) {
    fail("Error occured")
}
