package chapter.ch04.step1

/**
 * https://try.kotlinlang.org
 * InnerAndNestedClassesNestedByDefault2
 */

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}