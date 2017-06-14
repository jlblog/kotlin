package my.demo

/**
 * Created by KITV-NB22 on 2017-06-08.
 * Break and Continue Labels
 */

fun main(args: Array<String>) {
    breakLabel()
    foo()
}

fun breakLabel(){
    loop@for (i in 1..100 step 10) {
        println("i is $i")
        for (j in 1.. 100) {
            if (j == (10)) {
                println("j is $j end")
                break@loop
            }
        }
    }
}

fun foo() {
    var ints : List<Int> = listOf(1, 2, 0, 4)

    ints.forEach lit@ {
        if (it == 0) return@lit
        println(it)
    }

    ints.forEach{
        if (it == 0) return@forEach
        println("lambda $it")
    }

    ints.forEach(fun(value: Int) {
        if (value == 0) return
        println(value)
    })

}

