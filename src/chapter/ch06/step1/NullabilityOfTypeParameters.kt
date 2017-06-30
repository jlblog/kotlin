package chapter.ch06.step1

/**
 * https://try.kotlinlang.org
 * NullabilityOfTypeParameters
 */

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun main(args: Array<String>) {
    printHashCode(null)
}