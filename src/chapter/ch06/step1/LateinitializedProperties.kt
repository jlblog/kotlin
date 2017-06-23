package chapter.ch06.step1

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * https://try.kotlinlang.org
 * LateinitializedProperties
 */

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private var myService: MyService? = null

    @Before fun setUp() {
        myService = MyService()
    }

    @Test fun testAction() {
        Assert.assertEquals("foo", myService!!.performAction())
    }
}