package chapter.ch04.step3

/**
 * https://try.kotlinlang.org
 * StringRepresentationToString
 */

class Client(val name: String, val postalCode: Int){
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val client = Client("Alice", 342562)
    println(client)
}