package chapter.ch07.step1

/**
 * https://try.kotlinlang.org
 * BinaryOperators3,4
 */

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main(args: Array<String>) {
    println('a' * 3)
    println("====================")
    println(0x0F and 0xF0)
    println(0x0F or 0xF0)
    println(0x1 shl 4)
}