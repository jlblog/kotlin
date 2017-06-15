package chapter.ch02.step3

/**
 * https://try.kotlinlang.org
 * RefactoringReplacingIfWithWhen1
 */

// Using interface, class(ch02.step3.SmartCastsCombiningTypeChecksAndCasts.kt)

fun eval3(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.right) + eval(e.left)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(eval3(Sum(Num(1), Num(2))))
}