package chapter.ch03.step5

/**
 * https://try.kotlinlang.org
 * SplittingStrings,1
 */

fun main(args: Array<String>) {
    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".", "-"))
}