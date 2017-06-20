package chapter.ch04.step2

/**
 * https://try.kotlinlang.org
 * ImplementingPropertiesDeclaredInInterfaces1
 */

interface User7 {
    val email: String
    val nickNmae: String
        get() = email.substringBefore("@")
}