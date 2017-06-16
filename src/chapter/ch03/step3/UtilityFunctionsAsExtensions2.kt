package chapter.ch03.step3

/**
 * https://try.kotlinlang.org
 * UtilityFunctionsAsExtensions2
 */

// Using joinToString function(ch03.step3.JoinToStringFinal)

fun Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun main(args: Array<String>) {
    println(listOf("one", "two", "eight").join(" "))
}