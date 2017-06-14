package basics

/**
 * Created by KITV-NB22 on 2017-06-08.
 * For Loops
 * While Loops
 */



fun main(args: Array<String>) {
    var collections: List<String> = listOf("one", "two", "three")

    basics.forLoops(collections)
    basics.whileLoops()
}

fun forLoops(collections : List<String>){
    for (item in collections) println(item)

    for(i in collections.indices){
        println(collections[i])
    }

    for((index,value) in collections.withIndex()){
        println("the element at $index is $value")
    }
}

fun whileLoops(){
    var x = 3
    while (x > 0){
        println("x is $x")
        x--
    }
}
