package chapter.ch02.step3

/**
 *
 *
 * EvalIf
 */

// Using interface, class(ch02.step3.SmartCastsCombiningTypeChecksAndCasts.kt)

fun eval2(e: Expr): Int =
        if (e is Num) {
            e.value
        } else if (e is Sum) {
            eval(e.right) + eval(e.left)
        } else {
            throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(eval2(Sum(Num(1), Num(2))))
}