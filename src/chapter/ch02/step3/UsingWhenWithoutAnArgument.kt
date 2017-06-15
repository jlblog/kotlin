package chapter.ch02.step3

import chapter.ch02.step3.Colors.*

/**
 * https://try.kotlinlang.org
 * UsingWhenWithoutAnArgument
 */

fun mixOptimized(c1: Colors, c2: Colors) =
        when{
            (c1 == RED && c2 == YELLOW || c1 == YELLOW && c2 == RED) -> ORANGE
            (c1 == YELLOW && c2 == BLUE || c1 == BLUE && c2 == YELLOW) -> GREEN
            (c1 == BLUE && c2 == VIOLET || c1 == VIOLET && c2 == BLUE) -> INDIGO
            else -> throw Exception("Dirty color")
        }

fun main(args: Array<String>) {
    println(mixOptimized(BLUE, VIOLET))
    println(mixOptimized(YELLOW, VIOLET))
}