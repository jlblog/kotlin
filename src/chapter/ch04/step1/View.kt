package chapter.ch04.step1

import java.io.Serializable

/**
 * https://try.kotlinlang.org
 * View, Button1
 */

interface State: Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button3: View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {}
    class ButtonState: State{}
}