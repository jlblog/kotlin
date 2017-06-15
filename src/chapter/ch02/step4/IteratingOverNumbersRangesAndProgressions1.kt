package chapter.ch02.step4

/**
 * https://try.kotlinlang.org
 * IteratingOverNumbersRangesAndProgressions1
 */

// Using fizzBuzz function(ch02.step4.FizzBuzz.kt)

fun main(args: Array<String>) {
    for (i in 100 downTo 1 step 2){
        print(fizzBuzz(i))
    }
}
