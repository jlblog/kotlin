package chapter.ch02.step3

/**
 * https://try.kotlinlang.org
 * UsingWhenToDealWithEnumClasses
 */

// Using Colors Class(ch02-step3-Colors.kt)

fun getMnemonic(color: Colors) =
        when (color) {
            Colors.RED -> "Richard"
            Colors.ORANGE -> "Of"
            Colors.YELLOW -> "York"
            Colors.GREEN -> "Gave"
            Colors.BLUE -> "Battle"
            Colors.INDIGO -> "In"
            Colors.VIOLET -> "Vain"
        }

fun main(args: Array<String>) {
    println(getMnemonic(Colors.BLUE))
    println(getMnemonic(Colors.RED))
}