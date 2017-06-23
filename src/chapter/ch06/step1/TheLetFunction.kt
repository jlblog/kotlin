package chapter.ch06.step1

/**
 * https://try.kotlinlang.org
 * TheLetFunction
 */

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main(args: Array<String>) {
    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) }
    email = null
    email?.let { sendEmailTo(it) }
}