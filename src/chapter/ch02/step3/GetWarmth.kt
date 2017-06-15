package chapter.ch02.step3

/**
 * https://try.kotlinlang.org
 * GetWarmth
 */

// Using Colors Class(ch02-step3-Colors)

fun getWarmth(color: Colors) = when(color){
    Colors.RED, Colors.ORANGE, Colors.YELLOW -> "warm"
    Colors.GREEN -> "neutral"
    Colors.BLUE, Colors.INDIGO, Colors.VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth(Colors.VIOLET))
}