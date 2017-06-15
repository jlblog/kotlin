package chapter.ch02.step5

import java.io.BufferedReader
import java.io.StringReader

/**
 * https://try.kotlinlang.org
 * TryAsAnExprssion
 */

fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException){
        return
    }

    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber2(reader)
}