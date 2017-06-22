package chapter.ch05.step1

/**
 * https://try.kotlinlang.org
 * AccessiongVariablesInScope
 */

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun main(args: Array<String>) {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")
}