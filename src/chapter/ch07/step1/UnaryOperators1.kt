package chapter.ch07.step1

import java.math.BigDecimal

/**
 * https://try.kotlinlang.org
 * UnaryOperators1
 */

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main(args: Array<String>) {
    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}
