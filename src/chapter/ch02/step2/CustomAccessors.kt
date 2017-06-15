package chapter.ch02.step2

/**
 * https://try.kotlinlang.org
 * CustomAccessors
 */


class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}
