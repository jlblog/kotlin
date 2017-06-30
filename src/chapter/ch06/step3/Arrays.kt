package chapter.ch06.step3

/**
 * https://try.kotlinlang.org
 * Arrays, 1, 2, 3, 4
 */

fun main(args: Array<String>) {
    ArraySample()
    ArraySample1()
    ArraySample2()
    ArraySample3()
    ArraySample4()
}

fun ArraySample() {
    var args = listOf("This", "is", "String", "list")
    for (i in args.indices) {
        println("Argument $i is: ${args[i]}")
    }
}

fun ArraySample1() {
    val letters = Array<String>(26) { i -> ('a' + 1).toString() }
    println(letters.joinToString(" "))
}

fun ArraySample2() {
    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))
}

fun ArraySample3() {
    val squares = IntArray(5) {i -> (i + 1) * (i + 1)}
    println(squares.joinToString())
}

fun ArraySample4() {
    val args: Array<String> = arrayOf("array", "list", "is")

    args.forEachIndexed {index, element ->
        println("Argument $index is: $element")
    }
}
