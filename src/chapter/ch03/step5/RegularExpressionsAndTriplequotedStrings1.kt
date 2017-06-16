package chapter.ch03.step5

/**
 * https://try.kotlinlang.org
 * RegularExpressionsAndTriplequtoredStrings1
 */

fun parsePath2(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension ")
    }
}

fun main(args: Array<String>) {
    parsePath2("/Users/yole/kotlin-book/chapter.adoc")
}