package basics

/**
 * Created by KITV-NB22 on 2017-06-07.
 * Using ranges
 */

fun main(args: Array<String>) {
    basics.usingRanges()
    basics.checkOutOfRange()
    basics.iteratingOverRange()
    basics.overProgression()
}

fun usingRanges(){
    var x = 10
    var y = 9
    if (x in 1..y+1){
        println("fits in range")
    }else{
        println("1..y+1 = ${y+1}")
    }
}

fun checkOutOfRange(){
    var list = listOf("a", "b", "c")
    println("list.lastIndex is ${list.lastIndex}")

    if(-1 !in 0..list.lastIndex){
        println("-1 is out of range")
    }
    if(list.size !in list.indices){
        println("list size is out of valid list indices range too")
    }
}

fun iteratingOverRange() {
    for (x in 1..5){
        println(x)
    }
}

fun overProgression(){
    println("1 to 10 step2")
    for (x in 1..10 step 2){
        println("x is ${x}")
    }
    println("9 to 0 step 3")
    for (x in 9 downTo 0 step 3){
        println("x is ${x}")
    }
    println()
}
