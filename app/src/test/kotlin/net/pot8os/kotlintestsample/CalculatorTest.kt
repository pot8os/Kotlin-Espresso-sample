package net.pot8os.kotlintestsample

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.not
import org.junit.Assert.assertThat
import org.junit.Test

/**
 * @author So Nakamura, 2015/12/19
 */
class CalculatorTest {

    private val calclator = Calculator()

    @Test
    fun normalTest() {
        assertThat(calclator.calc("100", "200"), `is`("300"))
        assertThat(calclator.calc("1", "1"), `is`(not("3")))
    }

    @Test(expected = NumberFormatException::class)
    fun exceptionTest() {
        calclator.calc("", "")
    }
}