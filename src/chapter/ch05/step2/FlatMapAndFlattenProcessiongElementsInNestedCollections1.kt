package chapter.ch05.step2

/**
 * https://try.kotlinlang.org
 * FlatMapAndFlattenProcessingElementsInNestedCollections1
 */

class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
            Book("Mort", listOf("Terry Pratchett")),
            Book("Good Omens", listOf("Terry Pratchett", "Nail Gaiman"))
    )
    println(books.flatMap { it.authors }.toSet())
}
