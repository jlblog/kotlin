package chapter.ch02.step3

import chapter.ch02.step3.Colors.*

/**
 * https://try.kotlinlang.org
 * UsingWhenToDealWithEnumClasses2
 */

fun getWarmth2(color: Colors) = when(color){
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth2(VIOLET))
}

