package chapter.ch03.step3

/**
 * https://try.kotlinlang.org
 * NoOverridingForExtensionFunctions1
 */

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main(args: Array<String>) {
    val view: View = Button()
    view.showOff()
}