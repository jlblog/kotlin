package chapter.ch05.step1

/**
 * https://try.kotlinlang.org
 * LambdasAndCollections
 */

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people){
        if(person.age > maxAge){
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main(args: Array<String>) {
    var people = listOf(Person("Alice", 29), Person("Bob", 11))
    findTheOldest(people)
}