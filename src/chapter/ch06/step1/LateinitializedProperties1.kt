package chapter.ch06.step1

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * https://try.kotlinlang.org
 * LateinitializedProperties1
 */

class MyService2 {
    fun performAction(): String = "foo"
}

class MyTest2 {
    private lateinit var myService: MyService2

    @Before fun setUp() {
        myService = MyService2()
    }

    @Test fun testAction() {
        Assert.assertEquals("foo", myService.performAction())
    }
}