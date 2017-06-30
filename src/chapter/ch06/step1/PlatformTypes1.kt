package chapter.ch06.step1

/**
 * https://try.kotlinlang.org
 * PlatformTypes1
 */

class Person4(var name: String?)


fun yellAtSafe(person: Person4) {
    println((person.name ?: "Anyone").toUpperCase() + "!!!")
}

fun main(args: Array<String>) {
    yellAtSafe(Person4("My name is.."))
    yellAtSafe(Person4(""))
    yellAtSafe(Person4(null))
}
