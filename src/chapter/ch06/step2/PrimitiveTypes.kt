package chapter.ch06.step2

/**
 * https://try.kotlinlang.org
 * PrimitiveTypes
 */

fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 145)
    println("We're ${percent}% done!")
}

fun main(args: Array<String>) {
    showProgress(146)
}