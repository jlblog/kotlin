package chapter.ch02.step3

import chapter.ch02.step3.Colors.*

/**
 * https://try.kotlinlang.org
 * UsingWhenWithArbitraryObjects
 */

fun mix(c1: Colors, c2: Colors) =
        when (setOf(c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty color")
        }

fun main(args: Array<String>) {
    println(mix(BLUE, YELLOW))
}

