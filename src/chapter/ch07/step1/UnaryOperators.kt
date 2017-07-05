package chapter.ch07.step1

/**
 * https://try.kotlinlang.org
 * UnaryOperators
 */

data class Point5(val x: Int, val y: Int)

operator fun Point5.unaryMinus(): Point5 {
    return Point5(-x, -y)
}

fun main(args: Array<String>) {
    val p = Point5(10, 20)
    println(-p)
}
