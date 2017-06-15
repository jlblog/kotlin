package chapter.ch02.step4

/**
 * https://try.kotlinlang.org
 * UsingAnInCheck1
 */

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    in '!'..'*' -> "It's a symbol"
    else -> "I don't know.."
}

fun main(args: Array<String>) {
    println(recognize('1'))
    println(recognize('a'))
    println(recognize('!'))
}