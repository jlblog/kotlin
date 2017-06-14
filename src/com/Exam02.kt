package my.demo

import java.lang.Integer.parseInt

/**
 * Created by KITV-NB22 on 2017-06-05.
 */

fun printProduct(arg1: String, arg2: String){
    val x = parseInt(arg1)
    var y = parseInt(arg2)
    if(x != null && y != null){
        println(x*y)
    }else{
        println("either '$arg1' or '$arg2' is not a number")
    }
}

fun main(args: Array<String>) {
    //printProduct("not number", "3")
    println(getStringLength("this string's length is 26"))
}

fun getStringLength(obj: Any): Int? {
    if(obj !is String) return null
    return obj.length
}