package chapter.ch02.step1

/**
 * https://try.kotlinlang.org
 * StringTemplates2
 */

fun main(args: Array<String>) {
    println("Hello, ${if (args.size > 0) args[0] else "someone"}")
}
