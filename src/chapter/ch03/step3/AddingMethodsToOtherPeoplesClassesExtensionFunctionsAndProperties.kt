package chapter.ch03.step3

/**
 * https://try.kotlinlang.org
 * AddingMethodsToOtherPeoplesClassesExtensionFunctionsAndProperties
 */

fun String.lastChar(): Char = this.get(this.length - 1)
fun String.firstChar(): Char = this.get(0)

fun main(args: Array<String>) {
    val str: String = "Kotlin"
    println(str.lastChar())
    println(str.firstChar())
}