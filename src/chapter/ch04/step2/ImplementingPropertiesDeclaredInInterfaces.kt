package chapter.ch04.step2

/**
 * https://try.kotlinlang.org
 * ImplementingPropertiesDeclaredInInterfaces
 */

fun getFacebookName(accountId: Int) = "fb:$accountId"

interface User6 {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User6

class SubscribingUser(val email: String) : User6 {
    override val nickname: String
        get() = email.substringAfter('@')
}

class FacebookUser(val accountId: Int) : User6 {
    override val nickname = getFacebookName(accountId)
}

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)

    println(FacebookUser(123).nickname)
}
