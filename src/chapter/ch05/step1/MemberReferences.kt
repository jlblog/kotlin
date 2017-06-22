package chapter.ch05.step1

/**
 * https://try.kotlinlang.org
 * MemberReferences
 */

fun salute() = println("Salute!")

fun main(args: Array<String>) {
    run(::salute)
}