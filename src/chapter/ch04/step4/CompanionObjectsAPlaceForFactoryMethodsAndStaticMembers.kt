package chapter.ch04.step4

/**
 * https://try.kotlinlang.org
 * CompanionObjectsAPlaceForFactoryMethodsAndStaticMembers
 */

class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

fun main(args: Array<String>) {
    A.bar()
}