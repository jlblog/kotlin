package chapter.ch05.step5

/**
 * https://try.kotlinlang.org
 * TheWithFunction1
 */

fun alphabet2(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know the alphabet!")
        this.toString()
    }
}

fun main(args: Array<String>) {
    println(alphabet2())
}