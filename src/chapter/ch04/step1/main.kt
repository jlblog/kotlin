package chapter.ch04.step1

/**
 * https://try.kotlinlang.org
 * main
 */

interface Clickable2 {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) =
            println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button2: Clickable2, Focusable {
    override fun click() = println("I was clicked!")
    override fun showOff() {
        super<Clickable2>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    val button = Button2()
    button.showOff()
    button.setFocus(false)
    button.click()
}