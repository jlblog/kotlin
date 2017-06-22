package chapter.ch05.step2

/**
 * https://try.kotlinlang.org
 * AllAnyCountAndFindApplyingAPredicateToACollection1
 */

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(!list.all { it == 3 })  // 모든 요소가 주어진 값과 일치한다면 true 반환
    println(list.any { it != 3 })   // 하나이상의 요소가 일치한다면 true 반환
}
