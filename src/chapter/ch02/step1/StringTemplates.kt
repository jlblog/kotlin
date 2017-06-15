package chapter.ch02.step1

/**
 * https://try.kotlinlang.org
 * StringTemplates
 */

fun main(args: Array<String>) {
    val name = if(args.size > 0) args[0] else "Kotlin"
    println("Hello, $name")
}