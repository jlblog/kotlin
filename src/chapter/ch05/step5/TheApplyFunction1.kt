package chapter.ch05.step5

/**
 * https://try.kotlinlang.org
 * TheApplyFunction1
 */

fun alphabet5() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}

fun main(args: Array<String>) {
    println(alphabet5())
}