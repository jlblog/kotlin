package chapter.ch07.step2

/**
 * https://try.kotlinlang.org
 * EqualityOperators
 */

class Point(val x: Int, val y: Int) {
    override fun equals(obj: Any?): Boolean {
        if (obj === this) return true
        if (obj !is Point) return false
        return obj.x == x && obj.y == y
    }
}

fun main(args: Array<String>) {
    println(Point(10,20) == Point(10, 20))
}