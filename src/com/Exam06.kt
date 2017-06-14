package my.demo

/**
 * Created by KITV-NB22 on 2017-06-07.
 * Using collections
 */

private var items = listOf("apple", "banana", "kiwi")

fun main(args: Array<String>) {
    iteratingOverCollection()
    collectionContains()
    usingLambda()
}

fun iteratingOverCollection() {
    for (item in items){
        println("${item.substring(0,2)}")
    }
}

fun collectionContains(){
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}

fun usingLambda(){
    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("av") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}