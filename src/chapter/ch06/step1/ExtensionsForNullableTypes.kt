package chapter.ch06.step1

/**
 * https://try.kotlinlang.org
 * ExtensionsForNullableTypes
 */

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun main(args: Array<String>) {
    verifyUserInput("input field")
    verifyUserInput(null)
}