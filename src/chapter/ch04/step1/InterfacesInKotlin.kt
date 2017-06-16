package chapter.ch04.step1

/**
 * https://try.kotlinlang.org
 * InterfacesInKotlin
 */

interface Clickable {
    fun click()
}

class Button: Clickable{
    override fun click() = println("I was clicked")
}

fun main(args: Array<String>) {
    Button().click()
}