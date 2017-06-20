package chapter.ch04.step2

/**
 * https://try.kotlinlang.org
 * ChangingAccessorVisibility
 */

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String){
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}
