package chapter.ch04.step3

/**
 * https://try.kotlinlang.org
 * ObjectEqualityEquals1
 */

class Client3(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client3)
            return false
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun toString(): String {
        return "Client(name=$name, postalCode=$postalCode"
    }
}

fun main(args: Array<String>) {
    val processed = hashSetOf(Client3("Alice", 342562))
    println(processed.contains(Client3("Alice", 342562)))
    println(processed.toString())

    val cp = processed
    println(processed.equals(cp))
    println(cp.toString())
}