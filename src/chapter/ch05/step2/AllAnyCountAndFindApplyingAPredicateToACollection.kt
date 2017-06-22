package chapter.ch05.step2

/**
 * https://try.kotlinlang.org
 * AllAnyCountAndFindApplyingAPredicateToACollection
 */

data class Person3(val name: String, val age: Int)

val canBeInClub27 = { p: Person3 -> p.age >= 27}

fun main(args: Array<String>) {
    val people = listOf(Person3("Alice", 27), Person3("Bob", 31))
    println(people.all(canBeInClub27))
}