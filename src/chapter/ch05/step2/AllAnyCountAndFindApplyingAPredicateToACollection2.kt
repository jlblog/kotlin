package chapter.ch05.step2

/**
 * https://try.kotlinlang.org
 * AllAnyCountAndFindApplyingAPredicateToACollection2
 */

data class Person4(val name: String, val age: Int)

val canBeInClub28 = { p: Person4 -> p.age <= 28}

fun main(args: Array<String>) {
    val people = listOf(Person4("Alice", 28), Person4("Bob", 31), Person4("Diniel", 16))
    println(people.find(canBeInClub28))
}