package chapter.ch02.step2

/**
 * https://try.kotlinlang.org
 * Properties2
 */

class Person2(
        val name: String,
        var isMarried: Boolean
)

fun main(args: Array<String>) {
    val person = Person2("Bob", true)
    println(person.name)
    println(person.isMarried)
}
