package chapter.ch03.step3

/**
 * https://try.kotlinlang.org
 * NoOverridingForExtensionFunctions
 */

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
}