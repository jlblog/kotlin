package basics

/**
 * Created by KITV-NB22 on 2017-06-07.
 * Control Flow
 */

data class Customer(val name: String, val email: String)

fun main(args: Array<String>) {
    basics.ifExpression(10, 20)
    basics.whenExpression(-1)
    println(basics.hasPrefix(10))
}

fun ifExpression(a: Int, b: Int){
    //Traditional usage
    var max = a
    if (a < b) max = b
    println(max)

    // With else
    var min: Int
    if ( a < b ){
        min = a
    }else {
        min = b
    }
    println(min)

    // As expression
    var sum = if(a < b) a+b else a-b
    println(sum)

    var result = if(a > b){
        print("Choose a : $a")
    }else{
        print("Choose b : $b")
    }
    println("\n$result")
}

fun whenExpression(x: Int) {

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2. x is $x")
        }
    }

    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    var validNumbers = listOf(-1, -2, -3)
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }


}

fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    is Int -> x + 10
    else -> false
}