package chapter.ch04.step3

/**
 * https://try.kotlinlang.org
 * ClassDelegationUsingTheByKeyword
 */

class CountingSet<T> (
    val innerSet: MutableCollection<T> = HashSet<T>()
    ) : MutableCollection<T> by innerSet {
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectsAdded += c.size
            return innerSet.addAll(c)
        }
    }


fun main(args: Array<String>) {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")

    var sset = CountingSet<String>()
    sset.addAll(listOf("text", "string"))
    println("${sset.objectsAdded} objects were added, ${sset.size} remain")
}
