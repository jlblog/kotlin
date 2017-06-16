package chapter.ch03.step3

import chapter.ch03.step2.joinToString


/**
 * https://try.kotlinlang.org
 * UtilityFunctionsAsExtensions1
 */

// Using joinToString function (ch03.step3.JoinToStringFinal)
// Using joinToString function (ch03.step2.joinToString)

fun main(args: Array<String>) {
    val list = arrayListOf(1, 2, 3)
    println(list.joinToString(" "))

    println(joinToString(list, ":", "[", "]"))
}