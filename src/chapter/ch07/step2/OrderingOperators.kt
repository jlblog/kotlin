package chapter.ch07.step2

/**
 * https://try.kotlinlang.org
 * OrderingOperators, 1
 */

class Person1(val firstName: String, val lastName: String) : Comparable<Person1> {
    override fun compareTo(other: Person1): Int {
        return compareValuesBy(this, other, Person1::lastName, Person1::firstName)
    }
}

fun main(args: Array<String>) {
    val p1 = Person1("Alice", "Smith")
    val p2 = Person1("Bob", "Johnson")
    println(p1 < p2)

    println("===============")
    println("abc" < "bac")
}

