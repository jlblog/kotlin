package chapter.ch06.step3

/**
 * https://try.kotlinlang.org
 * ReadonlyAndMutableCollections
 */

fun <T> copyElemets(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source) {
        target.add(item)
    }
}

fun main(args: Array<String>) {
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElemets(source, target)
    println(target)
}