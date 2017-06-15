package chapter.ch02.step4

import java.util.*

/**
 * https://try.kotlinlang.org
 * IteratingOverMaps
 */

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        println("$c = ${c.toInt()} = ${Integer.toBinaryString(c.toInt())}")
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}