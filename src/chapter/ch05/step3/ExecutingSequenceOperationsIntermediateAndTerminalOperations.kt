package chapter.ch05.step3

/**
 * https://try.kotlinlang.org
 * ExecutingSequenceOperationsIntermediateAndTerminalOperations, 1
 */

fun main(args: Array<String>) {
    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList()
}