package chapter.ch04.step2

/**
 * https://try.kotlinlang.org
 * AccessingABackingFieldFromAGetterOrSetter
 */

class User8(val name: String){
    var address: String = "unspecitied"
        set(value: String){
            println("""
                Address was changed for $name:
                "$field" -> "$value". """.trimIndent())
            field = value
        }
}

fun main(args: Array<String>) {
    var user = User8("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"

    user.address = "reset"
}