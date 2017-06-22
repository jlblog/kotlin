package chapter.ch04.step4

/**
 * https://try.kotlinlang.org
 * CompanionObjectsAPlaceForFactoryMethodsAndStaticMembers1
 */

fun getFacebookName(accountId: Int) = "fb:$accountId"

class User private constructor(val nickname: String) {
    companion object {
     fun newSubscribingUser(email: String) = User(email.substringBefore('@'))
     fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))
    }
}

fun main(args: Array<String>) {
    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
    val facebookUser = User.newFacebookUser(4)
    println(subscribingUser.nickname)
    println(facebookUser.nickname)
}