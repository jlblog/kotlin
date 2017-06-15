package chapter.ch02.step2

import java.util.*

/**
 * https://try.kotlinlang.org
 * Rectangle
 */

// Using Rectangle class(ch02-step2-CustomAccessors.kt)

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}