package net.pot8os.kotlintestsample

/**
 * @author So Nakamura, 2015/12/19
 */
class Calculator {

    init {
    }

    fun calc(arg1: String, arg2: String): String {
        val answer = arg1.toLong() + arg2.toLong()
        return answer.toString()
    }
}