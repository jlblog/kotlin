package chapter.ch05.step1

/**
 * https://try.kotlinlang.org
 * MemberReferences1
 */

data class Person3(val name: String, val age: Int)

fun main(args: Array<String>) {
    val createPerson = ::Person3
    val p = createPerson("Alice", 20)
    println(p)
}