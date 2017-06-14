package cno


/**
 * Created by KITV-NB22 on 2017-06-14.
 * Properties and Fields
 */

class Address {
    var name: String = "Giung Jo"
    var street: String = "subusatgill"
    var city: String = "seoul"
    var state: String? = ""
    var zip: String = "12345"
}

fun copyAddress(address: Address): Address {
    var result = address
    result.name = "kotlin"
    result.street = "Android"

    return result
}

fun main(args: Array<String>) {
    var address = Address()
    var result = copyAddress(address)
    println(result.name)
    println(result.street)
    println(result.city)

}