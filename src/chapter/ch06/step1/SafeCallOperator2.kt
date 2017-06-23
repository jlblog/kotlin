package chapter.ch06.step1

/**
 * https://try.kotlinlang.org
 * SafeCallOperator2
 */

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
    val country = this.company?.address?.country
    return if (country != null) country else "Unkown"
}

fun main(args: Array<String>) {
    val person = Person("Dmitry", null)
    println(person.countryName())
}
