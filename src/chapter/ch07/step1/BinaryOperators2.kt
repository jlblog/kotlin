package chapter.ch07.step1

/**
 * https://try.kotlinlang.org
 * BinaryOperators2
 */

data class Point3(val x: Int, val y: Int)

operator fun Point3.times(scale: Double): Point3 {
    return Point3((x * scale).toInt(), (y * scale).toInt())
}

fun main(args: Array<String>) {
    val p = Point3(10, 20)
    println(p * 1.5)
}