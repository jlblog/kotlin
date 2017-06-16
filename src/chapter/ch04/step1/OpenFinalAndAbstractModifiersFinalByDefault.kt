package chapter.ch04.step1

/**
 * https://try.kotlinlang.org
 * OpenFinalAndAbstractModifiersFinalByDefault,1,2
 */

interface Clickable3 {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton: Clickable {
    fun disable() {}
    open fun animate() {}
    final override fun click() {}
}

abstract class Animated {
    abstract fun animate()
    open fun stopAnimating() {}
    fun animateTwice() {}
}

