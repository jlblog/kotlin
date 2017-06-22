package chapter.ch04.step3

/**
 * https://try.kotlinlang.org
 * DataClassesAndImmutabilityTheCopyMethod
 */

data class Client4(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val bob = Client4("Bob", 973293)
    println(bob.copy(postalCode = 382555))
    println(bob.copy(name = "Jo"))

    println(bob.copy("Daniel", 123456))
}