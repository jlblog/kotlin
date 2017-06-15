package chapter.ch02.step3

/**
 * https://try.kotlinlang.org
 * SmartCastsCombiningTypeChecksAndCasts
 */

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num){
        val n = e
        return n.value
    }
    if (e is Sum){
        return eval(e.right) + eval(e.left)
    }

    throw IllegalArgumentException("Unknown expression")
}

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}