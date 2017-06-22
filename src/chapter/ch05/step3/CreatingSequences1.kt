package chapter.ch05.step3

import java.io.File

/**
 * https://try.kotlinlang.org
 * CreatingSequences1
 */

fun File.isInsideHiddenDirectory() =
        generateSequence(this) {it.parentFile }.any { it.isHidden }

fun main(args: Array<String>) {
    val file = File("/Users/svtk/.HiddenDir/a.txt")
    println(file.isInsideHiddenDirectory())
}