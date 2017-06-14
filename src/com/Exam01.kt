package com

/**
 * Created by KITV-NB22 on 2017-06-14.
 */

fun main(args: Array<String>) {
    println("sum of 19 and 23 is ${sum(19, 23)}")

    printSum(11, 12)
    printSumNotUnit(200,400)

    var a = 1
    var s1 = "a is $a"
    println(s1)

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)

    println(maxOf(15, 12))
    println("간결 : " + maxOf2(15, 12))

}

fun sum(a: Int, b: Int) = a+b

fun printSum(a: Int, b: Int): Unit{
    println("sum of $a and $b is ${a + b}")
}

fun printSumNotUnit(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun maxOf(a: Int, b: Int): Int{
    if(a>b){
        return a
    }else{
        return b
    }
}

fun maxOf2(a: Int, b: Int) = if(a>b) a else b