package chapter.ch05.step5

/**
 * https://try.kotlinlang.org
 * TheApplyFunction
 */

fun alphabet4() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
}.toString()

fun main(args: Array<String>) {
    println(alphabet4())
}