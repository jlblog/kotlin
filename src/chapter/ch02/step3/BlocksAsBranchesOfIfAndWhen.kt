package chapter.ch02.step3

/**
 * https://try.kotlinlang.org
 * BlocksAsBranchesOfIfAndWhen
 */

// Using interface, class(ch02.step3.SmartCastsCombiningTypeChecksAndCasts.kt)

fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: $left + $right")
                left + right
            }
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}