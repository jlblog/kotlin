package chapter.ch05.step5

/**
 * https://try.kotlinlang.org
 * TheWithFunction2
 */

fun alphabet3() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}

fun main(args: Array<String>) {
    println(alphabet3())
}
