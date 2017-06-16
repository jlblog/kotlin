package chapter.ch04.step2

/**
 * https://try.kotlinlang.org
 * InitializingClassesPrimaryConstructorAndInitializerBlocks, 1, 2, 3, 4
 */

class User(val nickname: String)

class User2 constructor(_nickname: String) {
    val nickname: String

    init {
        nickname = _nickname
    }
}

class User3(_nickname: String) {
    val nickname = _nickname
}

class User4(val nickname: String)

class User5(val nickname: String, val isSubscribed: Boolean = true)

fun main(args: Array<String>) {
    val alice = User5("Alice")
    println(alice.isSubscribed)

    val bob = User5("Bob", false)
    println(bob.isSubscribed)

    val carol = User5("Carol", isSubscribed = false)
    println(carol.isSubscribed)
}