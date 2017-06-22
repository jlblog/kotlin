package chapter.ch04.step4

import java.io.File
import java.util.Comparator

/**
 * https://try.kotlinlang.org
 * ObjectDeclarationsSingletonsMadeEasy
 */

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File) : Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}

fun main(args: Array<String>) {
    println(CaseInsensitiveFileComparator.compare(
            File("/User"), File("/user")))
    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))
}