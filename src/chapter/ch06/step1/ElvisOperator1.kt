package chapter.ch06.step1

/**
 * https://try.kotlinlang.org
 * ElvisOperator1
 */

class Address2(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)

class Company2(val name: String, val address: Address2?)

class Person2(val name: String, val company: Company2)

fun printShippingLabel(person: Person2) {
    val address = person.company?.address ?: throw IllegalArgumentException("No address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun main(args: Array<String>) {
    val address = Address2("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company2("JetBrains", address)
    val person = Person2("Dmity", jetbrains)
    printShippingLabel(person)
    //`printShippingLabel(Person2("Alexey", null))
}