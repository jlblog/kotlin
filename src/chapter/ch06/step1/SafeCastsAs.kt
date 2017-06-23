package chapter.ch06.step1

/**
 * https://try.kotlinlang.org
 * SafeCastsAs
 */

class Person3(val firstName: String, val lastName: String) {
    override fun equals(o: Any?): Boolean {
        val otherPerson = o as? Person3 ?: return false

        return otherPerson.firstName == firstName && otherPerson.lastName == lastName
    }

    override fun hashCode(): Int =
        firstName.hashCode() * 37 + lastName.hashCode()
}

fun main(args: Array<String>) {
    val p1 = Person3("Dmitry", "Jemerov")
    val p2 = Person3("Dmitry", "Jemerov1")

    println(p1 == p2)
    println(p1.equals(p2))
    println("p1 = ${p1.hashCode()}, p2 = ${p2.hashCode()}")
}