package my.demo

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
    println(message = descript(1))
    println(message = descript("hello"))
    println(message = descript(123123123123))
    println(message = descript(99.9))
}

