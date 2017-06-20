package chapter.ch04.step3

/**
 * https://try.kotlinlang.org
 * ObjectEqualityEquals
 */


class Client2(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val client1 = Client2("Alice", 342562)
    val client2 = Client2("Alice", 342562)
    println(client1 == client2)
}