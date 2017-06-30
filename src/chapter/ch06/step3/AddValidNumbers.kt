package chapter.ch06.step3

import java.io.BufferedReader

/**
 * https://try.kotlinlang.org
 * AddValidNumbers
 */

fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number)
        } catch(e: NumberFormatException) {
            result.add(null)
        }
    }
    return result
}


