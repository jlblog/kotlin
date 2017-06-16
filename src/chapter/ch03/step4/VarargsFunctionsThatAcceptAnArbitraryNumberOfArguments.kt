package chapter.ch03.step4

/**
 * https://try.kotlinlang.org
 * VarargsFunctionsThatAcceptAnArbitraryNumberOfArguments
 */

fun main(args: Array<String>) {
    val list = listOf("args: " , *args)
    println(list)
}