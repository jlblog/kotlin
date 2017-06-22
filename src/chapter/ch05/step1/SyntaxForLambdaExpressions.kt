package chapter.ch05.step1

/**
 * https://try.kotlinlang.org
 * SyntaxForLambdaExpressions
 */

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(3, 4))
}