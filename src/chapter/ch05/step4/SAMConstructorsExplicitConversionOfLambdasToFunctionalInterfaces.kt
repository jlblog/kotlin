package chapter.ch05.step4

/**
 * https://try.kotlinlang.org
 * SAMConstructorsExplicitConversionOfLambdasToFunctionalInterfaces
 */

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

fun main(args: Array<String>) {
    createAllDoneRunnable().run()
}