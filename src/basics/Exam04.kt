package basics

/**
 * Created by KITV-NB22 on 2017-06-07.
 * Using when expression
 */

fun descript(obj: Any): String =
        when (obj){
            1 -> "One"
            "hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unkown"
        }

fun main(args: Array<String>) {
    println(message = basics.descript(1))
    println(message = basics.descript("hello"))
    println(message = basics.descript(123123123123))
    println(message = basics.descript(99.9))
}

