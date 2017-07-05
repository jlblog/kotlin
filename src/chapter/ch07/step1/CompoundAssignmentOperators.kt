package chapter.ch07.step1

/**
 * https://try.kotlinlang.org
 * CompoundAssignmentOperators
 */

data class Point4(val x: Int, val y: Int)

operator fun Point4.plus(other: Point4): Point4 {
    return Point4(x + other.x, y + other.y)
}

fun main(args: Array<String>) {
    var point = Point4(1, 2)
    point += Point4(3, 4)
    println(point)
}