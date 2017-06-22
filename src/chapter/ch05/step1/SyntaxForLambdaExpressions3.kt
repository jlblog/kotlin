package chapter.ch05.step1

/**
 * https://try.kotlinlang.org
 * SyntaxForLambdaExpressions3
 */

data class Person2(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person2("Alice", 29), Person2("Bob", 31))
    val names = people.joinToString(separator = " ",
            transform = { p: Person2 -> p.name})
    println(names)
}
