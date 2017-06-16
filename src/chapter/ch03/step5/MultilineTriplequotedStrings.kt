package chapter.ch03.step5

/**
 * https://try.kotlinlang.org
 * MultilineTriplequotedStrings
 */

val kotlinLogo = """| //
                   .|//
                   .|/ \"""

fun main(args: Array<String>) {
    println(kotlinLogo.trimMargin("."))
}
